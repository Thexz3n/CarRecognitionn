package cars;


interface Vehicle {
// define the instance variables

    String getName();
    String getBrand();
    String getColor();
    String getType();
    String getOwnCar();
    String getYearNumber();
    String getPlateNumber();
    int getModel();
    boolean isPartnership();
    boolean isFormalleted();

    // Database operations interface
    void getConnection();

    void registerCar(String Name, String Brand, String Color, String getType, String getOwnCar, String getYearNumber, String getPlateNumber, int Model, boolean partnership, boolean formalleted);

    void updateCar(int carID, String Name, String Brand, String Color, String getType, String getOwnCar, String getYearNumber, String getPlateNumber, int Model, boolean partnership, boolean formalleted);

    void deleteCar(int carID);

    // User interaction methods
    void firstDisplay();

    void inputDetaile();

    void updateInput();

    void deleteInput();

    void displayDetaile();
    
    
}
