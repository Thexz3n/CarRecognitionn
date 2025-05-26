/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package staff;

public interface Employee {

    // Getters
    String getName();

    String getPhone();

    String getEmail();

    String getAddress();

    String getRole();

    String getUsername();

    String getPassword();

    String getSecurityCode();

    // Setters
    void setInformation(String name, String username, String password,
            String securityCode, String phone, String email,
            String address, String role);

    // Database operations interface
    void getConnection();

    void createPerson(String name, String us, String pas, String SecurityCode,
            String phone, String email, String address, String role);

    void updatePerson(int EmployeeID, String name, String phone,
            String email, String address, String role);

    void deletePerson(int EmployeeID);

    // User interaction methods
    void firstDisplay();

    void inputDetaile();

    void updateInput();

    void deleteInput();

    void displayDetaile();

    // searching
    void searchingByID();

    void searchingByFullname();

    void searchingByPhone();

    void displayAll();
}
