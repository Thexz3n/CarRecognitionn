package backendcarregon.cars;

import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cars implements Vehicle {
    
    // Instance variables
    private Scanner user = new Scanner(System.in);
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private String Name;
    private String Brand;
    private String Color;
    private String Type;
    private String OwnCar;
    private String YearNumber;
    private String PlateNumber;
    private int Model;
    private boolean Partnership;
    private boolean Formalleted;
    

    public Cars() {
        getConnection();
    }
    
    // Parameterized constructor
    public Cars(String name, String brand, String color, String type, String ownCar, 
                String yearNumber, String PlateNumber, int model, boolean partnership, boolean formalleted) {
        this.Name = name;
        this.Brand = brand;
        this.Color = color;
        this.Type = type;
        this.OwnCar = ownCar;
        this.YearNumber = yearNumber;
        
        this.Model = model;
        this.Partnership = partnership;
        this.Formalleted = formalleted;
    }
    
    // Getter methods (implementing Vehicle interface)
    @Override
    public String getName() {
        return Name;
    }
    
    @Override
    public String getBrand() {
        return Brand;
    }
    
    @Override
    public String getColor() {
        return Color;
    }
    
    @Override
    public String getType() {
        return Type;
    }
    
    @Override
    public String getOwnCar() {
        return OwnCar;
    }
    
    @Override
    public String getYearNumber() {
        return YearNumber;
    }
    
    @Override
    public String getPlateNumber(){
        return PlateNumber;
    }
    
    @Override
    public int getModel() {
        return Model;
    }
    
    @Override
    public boolean isPartnership() {
        return Partnership;
    }
    
    @Override
    public boolean isFormalleted() {
        return Formalleted;
    }
    
    
    // Database connection method
    
    @Override
    public void getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/carsrecingotion", "root", "");
            if (con != null) {
                System.out.println("Database connected successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getMessage());
        }
    }
    
    // Register car method
    @Override
    public void registerCar(String Name, String Brand, String Color, String Type, 
                           String OwnCar, String YearNumber, String PlateNumber, int Model, 
                           boolean partnership, boolean formalleted) {
        this.Name = Name;
        this.Brand = Brand;
        this.Color = Color;
        this.Type = Type;
        this.OwnCar = OwnCar;
        this.YearNumber = YearNumber;
        this.PlateNumber = PlateNumber;
        this.Model = Model;
        this.Partnership = partnership;
        this.Formalleted = formalleted;
        
        // Also save to database
        createCar(Name, Brand, Color, Type, OwnCar, YearNumber, PlateNumber,Model, partnership, formalleted);
    }
    
    // Create car in database
    public void createCar(String Name, String Brand, String Color, String Type, 
                         String OwnCar, String YearNumber, String PlateNumber,int Model, 
                         boolean partnership, boolean formalleted) {
        getConnection();
        String sql = "INSERT INTO vehicle(Name, Brand, Color, Type, OwnCar, YearNumber, Model, partnership, formalleted) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, Name);
            pst.setString(2, Brand);
            pst.setString(3, Color);
            pst.setString(4, Type);
            pst.setString(5, OwnCar);
            pst.setString(6, YearNumber);
            pst.setInt(7, Model);
            pst.setBoolean(8, partnership);
            pst.setBoolean(9, formalleted);
            
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Car created successfully", "Create Car", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to create car", "Create Failed", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    
    // Update car in database
    @Override
    public void updateCar(int carID, String Name, String Brand, String Color, 
                         String Type, String OwnCar, String YearNumber, String PlateNumber,int Model, 
                         boolean partnership, boolean formalleted) {
        getConnection();
        String sql = "UPDATE vehicle SET Name=?, Brand=?, Color=?, Type=?, OwnCar=?, YearNumber=?, Model=?, partnership=?, formalleted=? WHERE carID=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, Name);
            pst.setString(2, Brand);
            pst.setString(3, Color);
            pst.setString(4, Type);
            pst.setString(5, OwnCar);
            pst.setString(6, YearNumber);
            pst.setInt(7, Model);
            pst.setBoolean(8, partnership);
            pst.setBoolean(9, formalleted);
            pst.setInt(10, carID);
            
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Car updated successfully", "Update Car", JOptionPane.INFORMATION_MESSAGE);
                // Update instance variables if this is the current car
                this.Name = Name;
                this.Brand = Brand;
                this.Color = Color;
                this.Type = Type;
                this.OwnCar = OwnCar;
                this.YearNumber = YearNumber;
                this.Model = Model;
                this.Partnership = partnership;
                this.Formalleted = formalleted;
            } else {
                JOptionPane.showMessageDialog(null, "No car found with the given CarID", "Update Failed", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    
    // Delete car from database
    @Override
    public void deleteCar(int carID) {
        getConnection();
        String sql = "DELETE FROM vehicle WHERE carID=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, carID);
            
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Car deleted successfully", "Delete Car", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No car found with the given CarID", "Delete Failed", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    
    // User interaction methods
    @Override
    public void firstDisplay() {
        System.out.println("Welcome to the Car Registration System");
        System.out.println("1. Create a car");
        System.out.println("2. Update a car");
        System.out.println("3. Delete a car");
        System.out.println("4. Display car details");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        
        int choice = user.nextInt();
        user.nextLine(); // consume newline
        
        switch (choice) {
            case 1:
                inputDetaile();
                break;
            case 2:
                updateInput();
                break;
            case 3:
                deleteInput();
                break;
            case 4:
                displayDetaile();
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                firstDisplay(); // Recursive call to show menu again
        }
    }
    
    @Override
    public void inputDetaile() {
        System.out.print("Enter the car name: ");
        String name = user.nextLine();
        
        System.out.print("Enter the car brand: ");
        String brand = user.nextLine();
        
        System.out.print("Enter the car color: ");
        String color = user.nextLine();
        
        System.out.print("Enter the car type: ");
        String type = user.nextLine();
        
        System.out.print("Enter the car owner: ");
        String ownCar = user.nextLine();
        
        System.out.print("Enter the year: ");
        String yearNumber = user.nextLine();
        
        System.out.print("Enter the plate number: ");
        String PlateNumber = user.nextLine();
        
        System.out.print("Enter the Year Number: ");
        int model = user.nextInt();
        user.nextLine(); // consume newline
        
        System.out.print("Does the car have a partnership? (true/false): ");
        boolean partnership = user.nextBoolean();
        user.nextLine(); // consume newline
        
        System.out.print("Is the car formally registered? (true/false): ");
        boolean formalleted = user.nextBoolean();
        user.nextLine(); // consume newline
        
        registerCar(name, brand, color, type, ownCar, yearNumber, PlateNumber,model, partnership, formalleted);
    }
    
    @Override
    public void updateInput() {
        System.out.print("Enter the CarID that you want to update: ");
        int carID = user.nextInt();
        user.nextLine(); // consume newline
        
        System.out.print("Enter the new car name: ");
        String name = user.nextLine();
        
        System.out.print("Enter the new car brand: ");
        String brand = user.nextLine();
        
        System.out.print("Enter the new car color: ");
        String color = user.nextLine();
        
        System.out.print("Enter the new car type: ");
        String type = user.nextLine();
        
        System.out.print("Enter the new car owner: ");
        String ownCar = user.nextLine();
        
        System.out.print("Enter the new year Number: ");
        String yearNumber = user.nextLine();
        
        System.out.print("Enter the new plate number: ");
        String PlateNumber = user.nextLine();
        
        System.out.print("Enter the new Year Number: ");
        int model = user.nextInt();
        user.nextLine(); // consume newline
        
        System.out.print("Does the car have a new partnership? (true/false): ");
        boolean partnership = user.nextBoolean();
        user.nextLine(); // consume newline
        
        System.out.print("Is the car newly formally registered? (true/false): ");
        boolean formalleted = user.nextBoolean();
        user.nextLine(); // consume newline
        
        updateCar(carID, name, brand, color, type, ownCar, yearNumber, PlateNumber,model, partnership, formalleted);
    }
    
    @Override
    public void deleteInput() {
        System.out.print("Enter the CarID that you want to delete: ");
        int carID = user.nextInt();
        user.nextLine(); // consume newline
        
        deleteCar(carID);
    }
    
    @Override
    public void displayDetaile() {
        System.out.println("\n=== Car Information ===");
        System.out.println("Car Name: " + getName());
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Car Color: " + getColor());
        System.out.println("Car Type: " + getType());
        System.out.println("Car Owner: " + getOwnCar());
        System.out.println("Year: " + getYearNumber());
        System.out.println("Car Model: " + getModel());
        System.out.println("Has Partnership: " + isPartnership());
        System.out.println("Formally Registered: " + isFormalleted());
        System.out.println("========================\n");
    }
   
}