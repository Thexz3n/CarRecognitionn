package staff;

import cars.Cars;
import cars.Truck;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Admin implements Employee {
    private String name;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String address;
    private String role;
    private String securityCode;

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private Scanner user;

    public Admin() {
        user = new Scanner(System.in);
        getConnection();
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getSecurityCode() {
        return securityCode;
    }

    // Setters
    @Override
    public void setInformation(String name, String username, String password,
                                String securityCode, String phone, String email,
                                String address, String role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.securityCode = securityCode;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    // Database operations
    @Override
    public void getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/carsrecingotion", "root", "");
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Connected to the database successfully (Admin)");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void createPerson(String name, String us, String pas, String securityCode,
                             String phone, String email, String address, String role) {
        try {
            String sql = "INSERT INTO employee (Name, username, password, SecurityCode, Phone, Email, Address, Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, us);
            pst.setString(3, pas);
            pst.setString(4, securityCode);
            pst.setString(5, phone);
            pst.setString(6, email);
            pst.setString(7, address);
            pst.setString(8, role);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Account created successfully by Admin", "Create Account", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void updatePerson(int employeeID, String name, String phone,
                             String email, String address, String role) {
        try {
            String sql = "UPDATE employee SET Name=?, Phone=?, Email=?, Address=?, Role=? WHERE EmployeeID=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, phone);
            pst.setString(3, email);
            pst.setString(4, address);
            pst.setString(5, role);
            pst.setInt(6, employeeID);
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Update successful! (Admin)", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No record updated. Please check Employee ID.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void deletePerson(int employeeID) {
        try {
            String sql = "DELETE FROM employee WHERE EmployeeID=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, employeeID);
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully by Admin!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No record found to delete. Check Employee ID.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // User interaction methods
    @Override
    public void firstDisplay() {
        System.out.println("Welcome to the Admin Employee Management System");
        System.out.println("1. Create Employee");
        System.out.println("2. Show all function in Cars");
        System.out.println("3. Show all function in Trucks");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Search Employee by ID");
        System.out.println("7. Search Employee by Full Name");
        System.out.println("8. Search Employee by Phone Number");
        System.out.println("9. Exit");
        System.out.print("Choose an option: ");
        int choice = user.nextInt();
        user.nextLine(); // Consume leftover newline

        switch (choice) {
            case 1:
                inputDetaile();
                break;
            case 2:
                Cars ca = new Cars();
                ca.firstDisplay();
                break;
            case 3:
                Truck c = new Truck();
                c.firstDisplay();
                break;
            case 4:
                updateInput();
                break;
            case 5:
                deleteInput();
                break;   
            case 6:
                searchingByID();
                break;
            case 7:
                searchingByFullname();
                break;
            case 8:
                searchingByPhone();
                break;
            case 9:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    @Override
    public void inputDetaile() {
        System.out.print("Write your full name: ");
        String name = user.nextLine();

        System.out.print("Write your username: ");
        String us = user.nextLine();

        System.out.print("Write your password: ");
        String pas = user.nextLine();

        System.out.print("Write your SecurityCode: ");
        String securityCode = user.nextLine();

        System.out.print("Write your phone number: ");
        String phone = user.nextLine();

        System.out.print("Write your email: ");
        String email = user.nextLine();

        System.out.print("Write your address: ");
        String address = user.nextLine();

        System.out.print("Write your role: \n   1. Admin\n   2. User\n");
        System.out.print("Choose (1 or 2): ");
        String roleChoice = user.nextLine().toLowerCase();

        // Convert number choice to actual role
        String role;
        if (roleChoice.equals("1")) {
            role = "admin";
        } else if (roleChoice.equals("2")) {
            role = "user";
        } else {
            role = roleChoice; // If they typed the role directly
        }

        setInformation(name, us, pas, securityCode, phone, email, address, role);
        System.out.println("");
        displayDetaile();
        createPerson(getName(), getUsername(), getPassword(), getSecurityCode(), getPhone(), getEmail(), getAddress(), getRole());
    }

    @Override
    public void updateInput() {
        System.out.print("Write the EmployeeID that you want to change data: ");
        int employeeID = user.nextInt();
        user.nextLine(); // Consume leftover newline

        System.out.print("Write new full name: ");
        String name = user.nextLine();

        System.out.print("Write new phone number: ");
        String phone = user.nextLine();

        System.out.print("Write new email: ");
        String email = user.nextLine();

        System.out.print("Write new address: ");
        String address = user.nextLine();

        System.out.print("Write new role: \n   1. Admin\n   2. User\n");
        System.out.print("Choose (1 or 2): ");
        String roleChoice = user.nextLine().toLowerCase();

        // Convert number choice to actual role
        String role;
        if (roleChoice.equals("1")) {
            role = "admin";
        } else if (roleChoice.equals("2")) {
            role = "user";
        } else {
            role = roleChoice;
        }

        updatePerson(employeeID, name, phone, email, address, role);
        System.out.println("");
    }

    @Override
    public void deleteInput() {
        System.out.print("Write your Employee ID that you want to delete: ");
        int employeeID = user.nextInt();
        user.nextLine(); // Consume leftover newline
        deletePerson(employeeID);
    }

    @Override
    public void displayDetaile() {
        System.out.println("Employee Information: ");
        System.out.println("Full name: " + getName());
        System.out.println("Phone number: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Address: " + getAddress());
        System.out.println("Role: " + getRole());
    }

    @Override
    public void searchingByID() {
        System.out.print("Write the UserID that you want to search: ");
        int employeeID = user.nextInt();
        user.nextLine(); // Consume leftover newline

        String sql = "SELECT * FROM employee WHERE EmployeeID=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, employeeID);
            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Employee Information: ");
                System.out.println("Full name: " + rs.getString("Name"));
                System.out.println("Phone number: " + rs.getString("Phone"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Address: " + rs.getString("Address"));
                System.out.println("Role: " + rs.getString("Role"));
            } else {
                JOptionPane.showMessageDialog(null, "No record found with EmployeeID: " + employeeID, "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void searchingByFullname() {
        System.out.print("Write the full name that you want to search: ");
        String name = user.nextLine();

        String sql = "SELECT * FROM employee WHERE Name=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Employee Information: ");
                System.out.println("Full name: " + rs.getString("Name"));
                System.out.println("Phone number: " + rs.getString("Phone"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Address: " + rs.getString("Address"));
                System.out.println("Role: " + rs.getString("Role"));
            } else {
                JOptionPane.showMessageDialog(null, "No record found with Name: " + name, "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void searchingByPhone() {
        System.out.print("Write the phone number that you want to search: ");
        String phone = user.nextLine();

        String sql = "SELECT * FROM employee WHERE Phone=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, phone);
            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Employee Information: ");
                System.out.println("Full name: " + rs.getString("Name"));
                System.out.println("Phone number: " + rs.getString("Phone"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Address: " + rs.getString("Address"));
                System.out.println("Role: " + rs.getString("Role"));
            } else {
                JOptionPane.showMessageDialog(null, "No record found with Phone: " + phone, "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void displayAll() {
        String sql = "SELECT * FROM employee";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("Employee Information: ");
                System.out.println("Full name: " + rs.getString("Name"));
                System.out.println("Phone number: " + rs.getString("Phone"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Address: " + rs.getString("Address"));
                System.out.println("Role: " + rs.getString("Role"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
