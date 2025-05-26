package staff;

import frontEND.Login;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class log {
    Scanner sc = new Scanner(System.in);
    Connection con;

    public log() {
        getConnection();
        showMainMenu();
    }

   public void getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/carsrecingotion", "root", "");
            if(con != null){
                JOptionPane.showMessageDialog(null, "Connect database successfully");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void showMainMenu() {
        System.out.println("1. Login");
        System.out.println("2. Create Account");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer
if (choice == 1) {
    Scanner sc = new Scanner(System.in);  // Make sure this scanner is initialized

    System.out.print("Enter role (Admin/User): ");
    String role = sc.nextLine();

    System.out.print("Enter username: ");
    String username = sc.nextLine();

    System.out.print("Enter password: ");
    String password = sc.nextLine();

    
    login(username, password, role);  // Call the login method with parameters
} else if (choice == 2) {
    Admin a = new Admin();
    a.inputDetaile();
} else {
    System.out.println("Invalid option");
}
    }

   public  void login(String username, String password, String role) {
    System.out.print("Enter role (Admin/User): ");
     role = sc.nextLine();

    System.out.print("Enter username: ");
     username = sc.nextLine();

    System.out.print("Enter password: ");
     password = sc.nextLine();

    try {
        String sql = "SELECT * FROM person WHERE username=? AND password=? AND role=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        pst.setString(3, role);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            System.out.println("Login successful. Welcome " + rs.getString("name") + "!");
            if (role.equalsIgnoreCase("Admin")) {
                Admin a = new Admin();
                a.firstDisplay();
            } else if (role.equalsIgnoreCase("User")) {
                System.out.println("You are logged in as a User.");
                // You can add user-specific menu here if needed.
            } else {
                System.out.println("Unknown role.");
            }
        } else {
            System.out.println("Login failed. Incorrect username, password, or role.");
        }
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
}


    public static void main(String[] args) {
        new log();
    }

    public void setVisible(boolean b) {
       
    }

   

    
}
