import mysql.connector
from mysql.connector import Error
import tkinter as tk
from tkinter import messagebox
import time
from abc import ABC, abstractmethod
import mysql.connector
from mysql.connector import Error
import tkinter as tk
from tkinter import messagebox
import mysql.connector
from mysql.connector import Error
import tkinter as tk
from tkinter import messagebox
from abc import ABC, abstractmethod
import sys


class BackendCarRegon:
    def __init__(self):
        # Initialize the login system
        self.login = Login()


class Database:
    def __init__(self):
        self.connection = None
        try:
            self.connection = mysql.connector.connect(
                host='127.0.0.1',
                port=3306,
                database='carsrecingotion',
                user='root',
                password=''
            )
            
            if self.connection.is_connected():
                print("Connection Successful")
                # Create a simple message box
                root = tk.Tk()
                root.withdraw()  # Hide the main window
                messagebox.showinfo("Database", "Connection Successful")
                root.destroy()
                
        except Error as e:
            print(f"Error: {e}")
            root = tk.Tk()
            root.withdraw()
            messagebox.showerror("Database", "Connection Failed")
            root.destroy()
    
    def get_connection(self):
        return self.connection
    
    def close_connection(self):
        if self.connection and self.connection.is_connected():
            self.connection.close()


class Login:
    def __init__(self):
        # Initialize login functionality here
        print("Login system initialized")


class Searching:
    def __init__(self):
        self.connection = None
        self.cursor = None
        self.running = True
    
    def connect_database(self):
        """Establish database connection"""
        try:
            self.connection = mysql.connector.connect(
                host='127.0.0.1',
                port=3306,
                database='carsrecingotion',
                user='root',
                password=''
            )
            return True
        except Error as e:
            print(f"Database connection error: {e}")
            return False
    
    def close_connection(self):
        """Close database connection and cursor"""
        try:
            if self.cursor:
                self.cursor.close()
            if self.connection and self.connection.is_connected():
                self.connection.close()
        except Error as e:
            print(f"Cleanup error: {e}")
    
    def search_plates(self):
        """Main searching functionality"""
        try:
            while self.running:
                # Reconnect to database on each iteration
                if not self.connect_database():
                    print("Failed to connect to database")
                    time.sleep(5)
                    continue
                
                try:
                    self.cursor = self.connection.cursor()
                    
                    # Query the database
                    sql = """
                    SELECT * FROM test_zanyary 
                    WHERE plate_text IN (
                        SELECT plate_text FROM plate_ocr
                    )
                    """
                    
                    self.cursor.execute(sql)
                    results = self.cursor.fetchall()
                    
                    # Process results
                    has_results = False
                    for row in results:
                        has_results = True
                        plate_text = row[0]  # Assuming plate_text is the first column
                        zanyay = row[1] if len(row) > 1 else None
                        print(f"Found plate: {plate_text}")
                        if zanyay:
                            print(f"Location: {zanyay}")
                    
                    if not has_results:
                        print("No new data found.")
                    
                except Error as e:
                    print(f"Query error: {e}")
                
                finally:
                    # Cleanup resources for this iteration
                    self.close_connection()
                
                # Add delay before next check
                print("Waiting for next check...")
                time.sleep(5)  # 5 seconds delay
                
        except KeyboardInterrupt:
            print("Search interrupted by user")
        except Exception as e:
            print(f"Unexpected error: {e}")
        finally:
            # Final cleanup
            self.close_connection()
    
    def stop_searching(self):
        """Stop the searching loop"""
        self.running = False


# Alternative version using context manager for better resource management
class SearchingImproved:
    def __init__(self):
        self.db_config = {
            'host': '127.0.0.1',
            'port': 3306,
            'database': 'carsrecingotion',
            'user': 'root',
            'password': ''
        }
        self.running = True
    
    def search_plates_improved(self):
        """Improved searching with context manager"""
        try:
            while self.running:
                try:
                    with mysql.connector.connect(**self.db_config) as connection:
                        with connection.cursor() as cursor:
                            # Query the database
                            sql = """
                            SELECT plate_text, zanyay FROM test_zanyary 
                            WHERE plate_text IN (
                                SELECT DISTINCT plate_text FROM plate_ocr
                            )
                            """
                            
                            cursor.execute(sql)
                            results = cursor.fetchall()
                            
                            # Process results
                            if results:
                                for plate_text, zanyay in results:
                                    print(f"Found plate: {plate_text}")
                                    if zanyay:
                                        print(f"Location: {zanyay}")
                                    print("-" * 30)
                            else:
                                print("No new data found.")
                
                except Error as e:
                    print(f"Database error: {e}")
                
                # Wait before next check
                print("Waiting for next check...")
                time.sleep(5)
                
        except KeyboardInterrupt:
            print("\nSearch stopped by user")
        except Exception as e:
            print(f"Unexpected error: {e}")
    
    def stop_searching(self):
        self.running = False


# Main execution
if __name__ == "__main__":
    # Option 1: Run the original structure
    print("Starting Car Recognition Backend...")
    backend = BackendCarRegon()
    
    print("\nStarting database connection test...")
    db = Database()
    
    print("\nStarting plate searching...")
    # Choose one of the following:
    
    # Option A: Original version
    searcher = Searching()
    searcher.search_plates()
    
    
    from abc import ABC, abstractmethod
import mysql.connector
from mysql.connector import Error
import tkinter as tk
from tkinter import messagebox


class Vehicle(ABC):
    """Abstract base class defining the Vehicle interface"""
    
    # Abstract getter methods
    @abstractmethod
    def get_name(self):
        pass
    
    @abstractmethod
    def get_brand(self):
        pass
    
    @abstractmethod
    def get_color(self):
        pass
    
    @abstractmethod
    def get_type(self):
        pass
    
    @abstractmethod
    def get_own_car(self):
        pass
    
    @abstractmethod
    def get_year_number(self):
        pass
    
    @abstractmethod
    def get_plate_number(self):
        pass
    
    @abstractmethod
    def get_model(self):
        pass
    
    @abstractmethod
    def is_partnership(self):
        pass
    
    @abstractmethod
    def is_formalleted(self):
        pass
    
    # Database operations interface
    @abstractmethod
    def get_connection(self):
        pass
    
    @abstractmethod
    def register_car(self, name, brand, color, car_type, own_car, year_number, 
                    plate_number, model, partnership, formalleted):
        pass
    
    @abstractmethod
    def update_car(self, car_id, name, brand, color, car_type, own_car, 
                  year_number, plate_number, model, partnership, formalleted):
        pass
    
    @abstractmethod
    def delete_car(self, car_id):
        pass
    
    # User interaction methods
    @abstractmethod
    def first_display(self):
        pass
    
    @abstractmethod
    def input_detail(self):
        pass
    
    @abstractmethod
    def update_input(self):
        pass
    
    @abstractmethod
    def delete_input(self):
        pass
    
    @abstractmethod
    def display_detail(self):
        pass


class Cars(Vehicle):
    """Cars class implementing the Vehicle interface"""
    
    def __init__(self, name=None, brand=None, color=None, car_type=None, 
                 own_car=None, year_number=None, plate_number=None, model=None, 
                 partnership=None, formalleted=None):
        # Instance variables
        self.connection = None
        self.cursor = None
        self.name = name
        self.brand = brand
        self.color = color
        self.type = car_type
        self.own_car = own_car
        self.year_number = year_number
        self.plate_number = plate_number
        self.model = model
        self.partnership = partnership
        self.formalleted = formalleted
        
        # Initialize database connection
        self.get_connection()
    
    # Getter methods (implementing Vehicle interface)
    def get_name(self):
        return self.name
    
    def get_brand(self):
        return self.brand
    
    def get_color(self):
        return self.color
    
    def get_type(self):
        return self.type
    
    def get_own_car(self):
        return self.own_car
    
    def get_year_number(self):
        return self.year_number
    
    def get_plate_number(self):
        return self.plate_number
    
    def get_model(self):
        return self.model
    
    def is_partnership(self):
        return self.partnership
    
    def is_formalleted(self):
        return self.formalleted
    
    # Database connection method
    def get_connection(self):
        try:
            self.connection = mysql.connector.connect(
                host='127.0.0.1',
                port=3306,
                database='carsrecingotion',
                user='root',
                password=''
            )
            if self.connection.is_connected():
                print("Database connected successfully")
        except Error as e:
            root = tk.Tk()
            root.withdraw()
            messagebox.showerror("Connection Error", str(e))
            root.destroy()
    
    # Register car method
    def register_car(self, name, brand, color, car_type, own_car, year_number, 
                    plate_number, model, partnership, formalleted):
        self.name = name
        self.brand = brand
        self.color = color
        self.type = car_type
        self.own_car = own_car
        self.year_number = year_number
        self.plate_number = plate_number
        self.model = model
        self.partnership = partnership
        self.formalleted = formalleted
        
        # Also save to database
        self.create_car(name, brand, color, car_type, own_car, year_number, 
                       plate_number, model, partnership, formalleted)
    
    # Create car in database
    def create_car(self, name, brand, color, car_type, own_car, year_number, 
                  plate_number, model, partnership, formalleted):
        self.get_connection()
        sql = """INSERT INTO vehicle (Name, Brand, Color, Type, OwnCar, YearNumber, 
                 Model, partnership, formalleted) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s)"""
        
        try:
            self.cursor = self.connection.cursor()
            self.cursor.execute(sql, (name, brand, color, car_type, own_car, 
                                    year_number, model, partnership, formalleted))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                root = tk.Tk()
                root.withdraw()
                messagebox.showinfo("Create Car", "Car created successfully")
                root.destroy()
            else:
                root = tk.Tk()
                root.withdraw()
                messagebox.showwarning("Create Failed", "Failed to create car")
                root.destroy()
                
        except Error as e:
            root = tk.Tk()
            root.withdraw()
            messagebox.showerror("Database Error", str(e))
            root.destroy()
        finally:
            self._close_resources()
    
    # Update car in database
    def update_car(self, car_id, name, brand, color, car_type, own_car, 
                  year_number, plate_number, model, partnership, formalleted):
        self.get_connection()
        sql = """UPDATE vehicle SET Name=%s, Brand=%s, Color=%s, Type=%s, OwnCar=%s, 
                 YearNumber=%s, Model=%s, partnership=%s, formalleted=%s WHERE carID=%s"""
        
        try:
            self.cursor = self.connection.cursor()
            self.cursor.execute(sql, (name, brand, color, car_type, own_car, 
                                    year_number, model, partnership, formalleted, car_id))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                root = tk.Tk()
                root.withdraw()
                messagebox.showinfo("Update Car", "Car updated successfully")
                root.destroy()
                
                # Update instance variables if this is the current car
                self.name = name
                self.brand = brand
                self.color = color
                self.type = car_type
                self.own_car = own_car
                self.year_number = year_number
                self.plate_number = plate_number
                self.model = model
                self.partnership = partnership
                self.formalleted = formalleted
            else:
                root = tk.Tk()
                root.withdraw()
                messagebox.showwarning("Update Failed", "No car found with the given CarID")
                root.destroy()
                
        except Error as e:
            root = tk.Tk()
            root.withdraw()
            messagebox.showerror("Database Error", str(e))
            root.destroy()
        finally:
            self._close_resources()
    
    # Delete car from database
    def delete_car(self, car_id):
        self.get_connection()
        sql = "DELETE FROM vehicle WHERE carID=%s"
        
        try:
            self.cursor = self.connection.cursor()
            self.cursor.execute(sql, (car_id,))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                root = tk.Tk()
                root.withdraw()
                messagebox.showinfo("Delete Car", "Car deleted successfully")
                root.destroy()
            else:
                root = tk.Tk()
                root.withdraw()
                messagebox.showwarning("Delete Failed", "No car found with the given CarID")
                root.destroy()
                
        except Error as e:
            root = tk.Tk()
            root.withdraw()
            messagebox.showerror("Database Error", str(e))
            root.destroy()
        finally:
            self._close_resources()
    
    # Helper method to close database resources
    def _close_resources(self):
        try:
            if self.cursor:
                self.cursor.close()
            if self.connection and self.connection.is_connected():
                self.connection.close()
        except Error as e:
            print(f"Error closing connection: {e}")
    
    # User interaction methods
    def first_display(self):
        print("Welcome to the Car Registration System")
        print("1. Create a car")
        print("2. Update a car")
        print("3. Delete a car")
        print("4. Display car details")
        print("5. Exit")
        
        try:
            choice = int(input("Enter your choice: "))
            
            if choice == 1:
                self.input_detail()
            elif choice == 2:
                self.update_input()
            elif choice == 3:
                self.delete_input()
            elif choice == 4:
                self.display_detail()
            elif choice == 5:
                print("Exiting...")
                exit()
            else:
                print("Invalid choice. Please try again.")
                self.first_display()  # Recursive call to show menu again
                
        except ValueError:
            print("Please enter a valid number.")
            self.first_display()
    
    def input_detail(self):
        try:
            name = input("Enter the car name: ")
            brand = input("Enter the car brand: ")
            color = input("Enter the car color: ")
            car_type = input("Enter the car type: ")
            own_car = input("Enter the car owner: ")
            year_number = input("Enter the year: ")
            plate_number = input("Enter the plate number: ")
            model = int(input("Enter the model year: "))
            
            partnership_input = input("Does the car have a partnership? (true/false): ").lower()
            partnership = partnership_input in ['true', 'yes', '1', 'y']
            
            formalleted_input = input("Is the car formally registered? (true/false): ").lower()
            formalleted = formalleted_input in ['true', 'yes', '1', 'y']
            
            self.register_car(name, brand, color, car_type, own_car, year_number, 
                            plate_number, model, partnership, formalleted)
            
        except ValueError as e:
            print(f"Invalid input: {e}")
            print("Please try again.")
    
    def update_input(self):
        try:
            car_id = int(input("Enter the CarID that you want to update: "))
            
            name = input("Enter the new car name: ")
            brand = input("Enter the new car brand: ")
            color = input("Enter the new car color: ")
            car_type = input("Enter the new car type: ")
            own_car = input("Enter the new car owner: ")
            year_number = input("Enter the new year: ")
            plate_number = input("Enter the new plate number: ")
            model = int(input("Enter the new model year: "))
            
            partnership_input = input("Does the car have a new partnership? (true/false): ").lower()
            partnership = partnership_input in ['true', 'yes', '1', 'y']
            
            formalleted_input = input("Is the car newly formally registered? (true/false): ").lower()
            formalleted = formalleted_input in ['true', 'yes', '1', 'y']
            
            self.update_car(car_id, name, brand, color, car_type, own_car, 
                          year_number, plate_number, model, partnership, formalleted)
            
        except ValueError as e:
            print(f"Invalid input: {e}")
            print("Please try again.")
    
    def delete_input(self):
        try:
            car_id = int(input("Enter the CarID that you want to delete: "))
            self.delete_car(car_id)
        except ValueError as e:
            print(f"Invalid input: {e}")
            print("Please try again.")
    
    def display_detail(self):
        print("\n=== Car Information ===")
        print(f"Car Name: {self.get_name()}")
        print(f"Car Brand: {self.get_brand()}")
        print(f"Car Color: {self.get_color()}")
        print(f"Car Type: {self.get_type()}")
        print(f"Car Owner: {self.get_own_car()}")
        print(f"Year: {self.get_year_number()}")
        print(f"Plate Number: {self.get_plate_number()}")
        print(f"Car Model: {self.get_model()}")
        print(f"Has Partnership: {self.is_partnership()}")
        print(f"Formally Registered: {self.is_formalleted()}")
        print("========================\n")


# Example usage and main execution
if __name__ == "__main__":
    # Create a Cars instance
    car_system = Cars()
    
    # Start the interactive menu
    while True:
        try:
            car_system.first_display()
        except KeyboardInterrupt:
            print("\nProgram interrupted by user. Exiting...")
            break
        except Exception as e:
            print(f"An error occurred: {e}")
            print("Please try again.")
            
            
            import mysql.connector
from mysql.connector import Error
import tkinter as tk
from tkinter import messagebox
from abc import ABC, abstractmethod

class Vehicle(ABC):
    """Abstract base class defining the Vehicle interface"""
    
    @abstractmethod
    def get_name(self):
        pass
    
    @abstractmethod
    def get_brand(self):
        pass
    
    @abstractmethod
    def get_color(self):
        pass
    
    @abstractmethod
    def get_type(self):
        pass
    
    @abstractmethod
    def get_own_car(self):
        pass
    
    @abstractmethod
    def get_year_number(self):
        pass
    
    @abstractmethod
    def get_plate_number(self):
        pass
    
    @abstractmethod
    def get_model(self):
        pass
    
    @abstractmethod
    def is_partnership(self):
        pass
    
    @abstractmethod
    def is_formalleted(self):
        pass
    
    @abstractmethod
    def get_connection(self):
        pass
    
    @abstractmethod
    def register_car(self, name, brand, color, type_val, own_car, year_number, 
                    plate_number, model, partnership, formalleted):
        pass
    
    @abstractmethod
    def update_car(self, car_id, name, brand, color, type_val, own_car, 
                  year_number, plate_number, model, partnership, formalleted):
        pass
    
    @abstractmethod
    def delete_car(self, car_id):
        pass
    
    @abstractmethod
    def first_display(self):
        pass
    
    @abstractmethod
    def input_detaile(self):
        pass
    
    @abstractmethod
    def update_input(self):
        pass
    
    @abstractmethod
    def delete_input(self):
        pass
    
    @abstractmethod
    def display_detaile(self):
        pass


class Truck(Vehicle):
    """Truck class implementing Vehicle interface with database operations"""
    
    def __init__(self, name=None, brand=None, color=None, type_val=None, own_car=None,
                 year_number=None, plate_number=None, load_capacity=0.0, truck_type=None,
                 model=0, partnership=False, formalleted=False):
        """Initialize Truck with optional parameters"""
        
        # Instance variables
        self.connection = None
        self.cursor = None
        self.name = name
        self.brand = brand
        self.color = color
        self.type = type_val
        self.own_car = own_car
        self.year_number = year_number
        self.plate_number = plate_number
        self.load_capacity = load_capacity
        self.truck_type = truck_type
        self.model = model
        self.partnership = partnership
        self.formalleted = formalleted
        
        # Initialize database connection
        self.get_connection()
    
    # Getter methods (implementing Vehicle interface)
    def get_name(self):
        return self.name
    
    def get_brand(self):
        return self.brand
    
    def get_color(self):
        return self.color
    
    def get_type(self):
        return self.type
    
    def get_own_car(self):
        return self.own_car
    
    def get_year_number(self):
        return self.year_number
    
    def get_plate_number(self):
        return self.plate_number
    
    def get_load_capacity(self):
        return self.load_capacity
    
    def get_truck_type(self):
        return self.truck_type
    
    def get_model(self):
        return self.model
    
    def is_partnership(self):
        return self.partnership
    
    def is_formalleted(self):
        return self.formalleted
    
    # Database connection method
    def get_connection(self):
        """Establish database connection"""
        try:
            self.connection = mysql.connector.connect(
                host='127.0.0.1',
                port=3306,
                database='carsrecingotion',
                user='root',
                password=''
            )
            if self.connection.is_connected():
                print("Database connected successfully")
                self.cursor = self.connection.cursor()
        except Error as ex:
            self.show_message("Connection Error", f"Connection Error: {ex}", "error")
    
    def show_message(self, title, message, msg_type="info"):
        """Show message dialog (replacement for JOptionPane)"""
        root = tk.Tk()
        root.withdraw()  # Hide the main window
        
        if msg_type == "error":
            messagebox.showerror(title, message)
        elif msg_type == "warning":
            messagebox.showwarning(title, message)
        else:
            messagebox.showinfo(title, message)
        
        root.destroy()
    
    # Register truck method
    def register_car(self, name, brand, color, type_val, own_car, year_number, 
                    plate_number, model, partnership, formalleted):
        """Register a basic truck"""
        self.name = name
        self.brand = brand
        self.color = color
        self.type = type_val
        self.own_car = own_car
        self.year_number = year_number
        self.plate_number = plate_number
        self.model = model
        self.partnership = partnership
        self.formalleted = formalleted
        
        # Also save to database
        self.create_truck(name, brand, color, type_val, own_car, year_number, 
                         plate_number, model, partnership, formalleted)
    
    def register_truck(self, name, brand, color, type_val, own_car, year_number, 
                      plate_number, load_capacity, truck_type, model, partnership, formalleted):
        """Register a truck with capacity and type"""
        self.name = name
        self.brand = brand
        self.color = color
        self.type = type_val
        self.own_car = own_car
        self.year_number = year_number
        self.plate_number = plate_number
        self.load_capacity = load_capacity
        self.truck_type = truck_type
        self.model = model
        self.partnership = partnership
        self.formalleted = formalleted
        
        # Also save to database
        self.create_truck_with_capacity(name, brand, color, type_val, own_car, year_number,
                                       plate_number, load_capacity, truck_type, model, 
                                       partnership, formalleted)
    
    def create_truck(self, name, brand, color, type_val, own_car, year_number, 
                    plate_number, model, partnership, formalleted):
        """Create truck in database (basic version)"""
        self.get_connection()
        sql = """INSERT INTO vehicle(Name, Brand, Color, Type, OwnCar, YearNumber, 
                 PlateNumber, Model, partnership, formalleted) 
                 VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"""
        
        try:
            self.cursor.execute(sql, (name, brand, color, type_val, own_car, year_number,
                                    plate_number, model, partnership, formalleted))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                self.show_message("Create Truck", "Truck created successfully", "info")
            else:
                self.show_message("Create Failed", "Failed to create truck", "warning")
                
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
        finally:
            self.close_connection()
    
    def create_truck_with_capacity(self, name, brand, color, type_val, own_car, year_number,
                                  plate_number, load_capacity, truck_type, model, 
                                  partnership, formalleted):
        """Create truck in database (with capacity and truck type)"""
        self.get_connection()
        sql = """INSERT INTO truck(Name, Brand, Color, Type, OwnCar, YearNumber, 
                 PlateNumber, LoadCapacity, TruckType, Model, partnership, formalleted) 
                 VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"""
        
        try:
            self.cursor.execute(sql, (name, brand, color, type_val, own_car, year_number,
                                    plate_number, load_capacity, truck_type, model, 
                                    partnership, formalleted))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                self.show_message("Create Truck", "Truck created successfully", "info")
            else:
                self.show_message("Create Failed", "Failed to create truck", "warning")
                
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
        finally:
            self.close_connection()
    
    def update_car(self, car_id, name, brand, color, type_val, own_car, year_number, 
                  plate_number, model, partnership, formalleted):
        """Update truck in database"""
        self.get_connection()
        sql = """UPDATE vehicle SET Name=%s, Brand=%s, Color=%s, Type=%s, OwnCar=%s, 
                 YearNumber=%s, PlateNumber=%s, Model=%s, partnership=%s, formalleted=%s 
                 WHERE truckID=%s"""
        
        try:
            self.cursor.execute(sql, (name, brand, color, type_val, own_car, year_number,
                                    plate_number, model, partnership, formalleted, car_id))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                self.show_message("Update Truck", "Truck updated successfully", "info")
                # Update instance variables if this is the current truck
                self.name = name
                self.brand = brand
                self.color = color
                self.type = type_val
                self.own_car = own_car
                self.year_number = year_number
                self.plate_number = plate_number
                self.model = model
                self.partnership = partnership
                self.formalleted = formalleted
            else:
                self.show_message("Update Failed", "No truck found with the given TruckID", "warning")
                
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
        finally:
            self.close_connection()
    
    def delete_car(self, car_id):
        """Delete truck from database"""
        self.get_connection()
        sql = "DELETE FROM vehicle WHERE truckID=%s"
        
        try:
            self.cursor.execute(sql, (car_id,))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                self.show_message("Delete Truck", "Truck deleted successfully", "info")
            else:
                self.show_message("Delete Failed", "No truck found with the given TruckID", "warning")
                
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
        finally:
            self.close_connection()
    
    def close_connection(self):
        """Close database connection"""
        try:
            if self.cursor:
                self.cursor.close()
            if self.connection and self.connection.is_connected():
                self.connection.close()
        except Error as e:
            print(f"Error closing connection: {e}")
    
    # User interaction methods
    def first_display(self):
        """Display main menu and handle user choice"""
        print("Welcome to the Truck Registration System")
        print("1. Create a truck")
        print("2. Update a truck")
        print("3. Delete a truck")
        print("4. Display truck details")
        print("5. Exit")
        
        try:
            choice = int(input("Enter your choice: "))
            
            if choice == 1:
                self.input_detaile()
            elif choice == 2:
                self.update_input()
            elif choice == 3:
                self.delete_input()
            elif choice == 4:
                self.display_detaile()
            elif choice == 5:
                print("Exiting...")
                exit()
            else:
                print("Invalid choice. Please try again.")
                self.first_display()  # Recursive call to show menu again
                
        except ValueError:
            print("Please enter a valid number.")
            self.first_display()
    
    def input_detaile(self):
        """Get input details for creating a truck"""
        try:
            name = input("Enter the car name: ")
            brand = input("Enter the car brand: ")
            color = input("Enter the car color: ")
            type_val = input("Enter the car type: ")
            own_car = input("Enter the car owner: ")
            year_number = input("Enter the year: ")
            plate_number = input("Enter the plate number: ")
            model = int(input("Enter the car model: "))
            partnership = input("Does the car have a partnership? (true/false): ").lower() == 'true'
            formalleted = input("Is the car formally registered? (true/false): ").lower() == 'true'
            
            self.register_car(name, brand, color, type_val, own_car, year_number, 
                            plate_number, model, partnership, formalleted)
            
        except ValueError:
            print("Please enter valid values.")
    
    def update_input(self):
        """Get input for updating a truck"""
        try:
            car_id = int(input("Enter the CarID that you want to update: "))
            name = input("Enter the new car name: ")
            brand = input("Enter the new car brand: ")
            color = input("Enter the new car color: ")
            type_val = input("Enter the new car type: ")
            own_car = input("Enter the new car owner: ")
            year_number = input("Enter the new year: ")
            plate_number = input("Enter the plate number: ")
            model = int(input("Enter the new car model: "))
            partnership = input("Does the car have a new partnership? (true/false): ").lower() == 'true'
            formalleted = input("Is the car newly formally registered? (true/false): ").lower() == 'true'
            
            self.update_car(car_id, name, brand, color, type_val, own_car, year_number, 
                          plate_number, model, partnership, formalleted)
            
        except ValueError:
            print("Please enter valid values.")
    
    def delete_input(self):
        """Get input for deleting a truck"""
        try:
            truck_id = int(input("Enter the TruckID that you want to delete: "))
            self.delete_car(truck_id)
        except ValueError:
            print("Please enter a valid truck ID.")
    
    def display_detaile(self):
        """Display truck details"""
        print("\n=== Car Information ===")
        print(f"Car Name: {self.get_name()}")
        print(f"Car Brand: {self.get_brand()}")
        print(f"Car Color: {self.get_color()}")
        print(f"Car Type: {self.get_type()}")
        print(f"Car Owner: {self.get_own_car()}")
        print(f"Year: {self.get_year_number()}")
        print(f"Plate Number: {self.get_plate_number()}")
        print(f"Car Model: {self.get_model()}")
        print(f"Has Partnership: {self.is_partnership()}")
        print(f"Formally Registered: {self.is_formalleted()}")
        if self.load_capacity > 0:
            print(f"Load Capacity: {self.get_load_capacity()}")
        if self.truck_type:
            print(f"Truck Type: {self.get_truck_type()}")
        print("========================\n")


# Example usage
if __name__ == "__main__":
    # Create a truck instance and start the interactive system
    truck = Truck()
    truck.first_display()
    
    



# Abstract Employee interface
class Employee(ABC):
    """Abstract base class defining the Employee interface"""
    
    @abstractmethod
    def get_name(self):
        pass
    
    @abstractmethod
    def get_phone(self):
        pass
    
    @abstractmethod
    def get_email(self):
        pass
    
    @abstractmethod
    def get_address(self):
        pass
    
    @abstractmethod
    def get_role(self):
        pass
    
    @abstractmethod
    def get_username(self):
        pass
    
    @abstractmethod
    def get_password(self):
        pass
    
    @abstractmethod
    def get_security_code(self):
        pass
    
    @abstractmethod
    def set_information(self, name, username, password, security_code, 
                       phone, email, address, role):
        pass
    
    @abstractmethod
    def get_connection(self):
        pass
    
    @abstractmethod
    def create_person(self, name, username, password, security_code,
                     phone, email, address, role):
        pass
    
    @abstractmethod
    def update_person(self, employee_id, name, phone, email, address, role):
        pass
    
    @abstractmethod
    def delete_person(self, employee_id):
        pass
    
    @abstractmethod
    def first_display(self):
        pass
    
    @abstractmethod
    def input_detaile(self):
        pass
    
    @abstractmethod
    def update_input(self):
        pass
    
    @abstractmethod
    def delete_input(self):
        pass
    
    @abstractmethod
    def display_detaile(self):
        pass
    
    @abstractmethod
    def searching_by_id(self):
        pass
    
    @abstractmethod
    def searching_by_fullname(self):
        pass
    
    @abstractmethod
    def searching_by_phone(self):
        pass
    
    @abstractmethod
    def display_all(self):
        pass


class Login:
    """Login class for user authentication"""
    
    def __init__(self):
        self.connection = None
        self.get_connection()
        self.show_main_menu()
    
    def get_connection(self):
        """Establish database connection"""
        try:
            self.connection = mysql.connector.connect(
                host='127.0.0.1',
                port=3306,
                database='carsrecingotion',
                user='root',
                password=''
            )
            if self.connection.is_connected():
                self.show_message("Database Connection", "Connect database successfully", "info")
        except Error as ex:
            self.show_message("Connection Error", str(ex), "error")
    
    def show_message(self, title, message, msg_type="info"):
        """Show message dialog"""
        root = tk.Tk()
        root.withdraw()  # Hide the main window
        
        if msg_type == "error":
            messagebox.showerror(title, message)
        elif msg_type == "warning":
            messagebox.showwarning(title, message)
        else:
            messagebox.showinfo(title, message)
        
        root.destroy()
    
    def show_main_menu(self):
        """Display main menu and handle user choice"""
        print("1. Login")
        print("2. Create Account")
        
        try:
            choice = int(input("Choose option: "))
            
            if choice == 1:
                self.login()
            elif choice == 2:
                # Create new admin account
                admin = Admin()
                admin.input_detaile()
            else:
                print("Invalid option")
                self.show_main_menu()
        except ValueError:
            print("Please enter a valid number")
            self.show_main_menu()
    
    def login(self):
        """Handle user login"""
        role = input("Enter role (Admin/User): ")
        username = input("Enter username: ")
        password = input("Enter password: ")
        
        try:
            sql = "SELECT * FROM employee WHERE username=%s AND password=%s AND role=%s"
            cursor = self.connection.cursor()
            cursor.execute(sql, (username, password, role))
            result = cursor.fetchone()
            
            if result:
                print(f"Login successful. Welcome {result[1]}!")  # Assuming name is at index 1
                
                if role.lower() == "admin":
                    admin = Admin()
                    admin.first_display()
                elif role.lower() == "user":
                    print("You are logged in as a User.")
                    user = User()
                    user.first_display()
                else:
                    print("Unknown role.")
            else:
                print("Login failed. Incorrect username, password, or role.")
                
        except Error as e:
            print(f"Error: {e}")
        finally:
            if cursor:
                cursor.close()


class User(Employee):
    """User class implementing Employee interface"""
    
    def __init__(self):
        # Instance variables
        self.name = None
        self.username = None
        self.password = None
        self.phone = None
        self.email = None
        self.address = None
        self.role = None
        self.security_code = None
        
        # Database connection variables
        self.connection = None
        self.cursor = None
        
        self.get_connection()
    
    # Getter methods
    def get_name(self):
        return self.name
    
    def get_phone(self):
        return self.phone
    
    def get_email(self):
        return self.email
    
    def get_address(self):
        return self.address
    
    def get_role(self):
        return self.role
    
    def get_username(self):
        return self.username
    
    def get_password(self):
        return self.password
    
    def get_security_code(self):
        return self.security_code
    
    # Setter method
    def set_information(self, name, username, password, security_code,
                       phone, email, address, role):
        """Set all user information"""
        self.name = name
        self.username = username
        self.password = password
        self.security_code = security_code
        self.phone = phone
        self.email = email
        self.address = address
        self.role = role
    
    def show_message(self, title, message, msg_type="info"):
        """Show message dialog"""
        root = tk.Tk()
        root.withdraw()  # Hide the main window
        
        if msg_type == "error":
            messagebox.showerror(title, message)
        elif msg_type == "warning":
            messagebox.showwarning(title, message)
        else:
            messagebox.showinfo(title, message)
        
        root.destroy()
    
    # Database operations
    def get_connection(self):
        """Establish database connection"""
        try:
            self.connection = mysql.connector.connect(
                host='127.0.0.1',
                port=3306,
                database='carsrecingotion',
                user='root',
                password=''
            )
            if self.connection.is_connected():
                self.show_message("Database Connection", "Connected to the database successfully", "info")
                self.cursor = self.connection.cursor()
        except Error as ex:
            self.show_message("Connection Error", str(ex), "error")
    
    def create_person(self, name, username, password, security_code,
                     phone, email, address, role):
        """Create a new person in the database"""
        try:
            sql = """INSERT INTO employee (Name, username, password, SecurityCode, 
                     Phone, Email, Address, Role) VALUES (%s, %s, %s, %s, %s, %s, %s, %s)"""
            self.cursor.execute(sql, (name, username, password, security_code,
                                    phone, email, address, role))
            self.connection.commit()
            self.show_message("Create Account", "Account created successfully", "info")
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
    
    def update_person(self, employee_id, name, phone, email, address, role):
        """Update person information in the database"""
        try:
            sql = """UPDATE employee SET Name=%s, Phone=%s, Email=%s, Address=%s, 
                     Role=%s WHERE EmployeeID=%s"""
            self.cursor.execute(sql, (name, phone, email, address, role, employee_id))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                self.show_message("Success", "Update successful!", "info")
            else:
                self.show_message("Error", "No record updated. Please check Employee ID.", "warning")
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
    
    def delete_person(self, employee_id):
        """Delete person from the database"""
        try:
            sql = "DELETE FROM employee WHERE EmployeeID=%s"
            self.cursor.execute(sql, (employee_id,))
            self.connection.commit()
            
            if self.cursor.rowcount > 0:
                self.show_message("Success", "Record deleted successfully!", "info")
            else:
                self.show_message("Error", "No record found to delete. Check Employee ID.", "warning")
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
    
    # User interaction methods
    def first_display(self):
        """Display main menu and handle user choice"""
        print("Welcome to the Employee Management System")
        print("1. Create Employee")
        print("2. Update Employee")
        print("3. Add a new cars")
        print("4. Add a new Trucks")
        print("5. Search Employee by ID")
        print("6. Search Employee by Full Name")
        print("7. Search Employee by Phone Number")
        print("8. Exit")
        
        try:
            choice = int(input("Choose an option: "))
            
            if choice == 1:
                self.input_detaile()
            elif choice == 2:
                self.update_input()
            elif choice == 3:
                # Note: You'll need to import Cars class when available
                print("Cars functionality not yet implemented")
                # cars = Cars()
                # cars.input_detaile()
            elif choice == 4:
                # Note: You'll need to import Truck class when available
                print("Truck functionality not yet implemented")
                # truck = Truck()
                # truck.input_detaile()
            elif choice == 5:
                self.searching_by_id()
            elif choice == 6:
                self.searching_by_fullname()
            elif choice == 7:
                self.searching_by_phone()
            elif choice == 8:
                print("Exiting...")
                sys.exit(0)
            else:
                print("Invalid choice. Please try again.")
                self.first_display()
                
        except ValueError:
            print("Please enter a valid number.")
            self.first_display()
    
    def input_detaile(self):
        """Get input details for creating a new employee"""
        name = input("Write your full name: ")
        username = input("Write your username: ")
        password = input("Write your password: ")
        security_code = input("Write your SecurityCode: ")
        phone = input("Write your phone number: ")
        email = input("Write your email: ")
        address = input("Write your address: ")
        
        print("Write your role:")
        print("   1. Admin")
        print("   2. User")
        role_choice = input("Choose (1 or 2): ").strip()
        
        # Convert number choice to actual role
        if role_choice == "1":
            role = "admin"
        elif role_choice == "2":
            role = "user"
        else:
            role = role_choice.lower()  # If they typed the role directly
        
        self.set_information(name, username, password, security_code, 
                           phone, email, address, role)
        print()
        self.display_detaile()
        self.create_person(self.get_name(), self.get_username(), self.get_password(),
                         self.get_security_code(), self.get_phone(), self.get_email(),
                         self.get_address(), self.get_role())
    
    def update_input(self):
        """Get input for updating an employee"""
        try:
            employee_id = int(input("Write the EmployeeID that you want to change data: "))
            name = input("Write new full name: ")
            phone = input("Write new phone number: ")
            email = input("Write new email: ")
            address = input("Write new address: ")
            
            print("Write new role:")
            print("   1. Admin")
            print("   2. User")
            role_choice = input("Choose (1 or 2): ").strip()
            
            # Convert number choice to actual role
            if role_choice == "1":
                role = "admin"
            elif role_choice == "2":
                role = "user"
            else:
                role = role_choice.lower()
            
            self.update_person(employee_id, name, phone, email, address, role)
            print()
        except ValueError:
            print("Please enter a valid Employee ID.")
    
    def delete_input(self):
        """Get input for deleting an employee"""
        try:
            employee_id = int(input("Write your Employee ID that you want to delete: "))
            self.delete_person(employee_id)
        except ValueError:
            print("Please enter a valid Employee ID.")
    
    def display_detaile(self):
        """Display employee details"""
        print("Employee Information:")
        print(f"Full name: {self.get_name()}")
        print(f"Phone number: {self.get_phone()}")
        print(f"Email: {self.get_email()}")
        print(f"Address: {self.get_address()}")
        print(f"Role: {self.get_role()}")
    
    def searching_by_id(self):
        """Search employee by ID"""
        try:
            employee_id = int(input("Write the UserID that you want to search: "))
            
            sql = "SELECT * FROM employee WHERE EmployeeID=%s"
            self.cursor.execute(sql, (employee_id,))
            result = self.cursor.fetchone()
            
            if result:
                print("Employee Information:")
                print(f"Full name: {result[1]}")  # Assuming Name is at index 1
                print(f"Phone number: {result[5]}")  # Assuming Phone is at index 5
                print(f"Email: {result[6]}")  # Assuming Email is at index 6
                print(f"Address: {result[7]}")  # Assuming Address is at index 7
                print(f"Role: {result[8]}")  # Assuming Role is at index 8
            else:
                self.show_message("Search Result", f"No record found with EmployeeID: {employee_id}", "info")
                
        except ValueError:
            print("Please enter a valid Employee ID.")
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
    
    def searching_by_fullname(self):
        """Search employee by full name"""
        name = input("Write the full name that you want to search: ")
        
        try:
            sql = "SELECT * FROM employee WHERE Name=%s"
            self.cursor.execute(sql, (name,))
            result = self.cursor.fetchone()
            
            if result:
                print("Employee Information:")
                print(f"Full name: {result[1]}")
                print(f"Phone number: {result[5]}")
                print(f"Email: {result[6]}")
                print(f"Address: {result[7]}")
                print(f"Role: {result[8]}")
            else:
                self.show_message("Search Result", f"No record found with Name: {name}", "info")
                
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
    
    def searching_by_phone(self):
        """Search employee by phone number"""
        phone = input("Write the phone number that you want to search: ")
        
        try:
            sql = "SELECT * FROM employee WHERE Phone=%s"
            self.cursor.execute(sql, (phone,))
            result = self.cursor.fetchone()
            
            if result:
                print("Employee Information:")
                print(f"Full name: {result[1]}")
                print(f"Phone number: {result[5]}")
                print(f"Email: {result[6]}")
                print(f"Address: {result[7]}")
                print(f"Role: {result[8]}")
            else:
                self.show_message("Search Result", f"No record found with Phone: {phone}", "info")
                
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
    
    def display_all(self):
        """Display all employees"""
        try:
            sql = "SELECT * FROM employee"
            self.cursor.execute(sql)
            results = self.cursor.fetchall()
            
            for result in results:
                print("Employee Information:")
                print(f"Full name: {result[1]}")
                print(f"Phone number: {result[5]}")
                print(f"Email: {result[6]}")
                print(f"Address: {result[7]}")
                print(f"Role: {result[8]}")
                print("------------------------")
                
        except Error as e:
            self.show_message("Database Error", f"Error: {e}", "error")
    
    def close_connection(self):
        """Close database connection"""
        try:
            if self.cursor:
                self.cursor.close()
            if self.connection and self.connection.is_connected():
                self.connection.close()
        except Error as e:
            print(f"Error closing connection: {e}")


# Admin class inheriting from User (placeholder for now)
class Admin(User):
    """Admin class inheriting from User with additional privileges"""
    
    def __init__(self):
        super().__init__()
    
    def first_display(self):
        """Override parent method with admin-specific menu"""
        print("Welcome to the Admin Panel")
        print("1. Create Employee")
        print("2. Update Employee")
        print("3. Delete Employee")
        print("4. Add a new cars")
        print("5. Add a new Trucks")
        print("6. Search Employee by ID")
        print("7. Search Employee by Full Name")
        print("8. Search Employee by Phone Number")
        print("9. Display All Employees")
        print("10. Exit")
        
        try:
            choice = int(input("Choose an option: "))
            
            if choice == 1:
                self.input_detaile()
            elif choice == 2:
                self.update_input()
            elif choice == 3:
                self.delete_input()
            elif choice == 4:
                print("Cars functionality not yet implemented")
            elif choice == 5:
                print("Truck functionality not yet implemented")
            elif choice == 6:
                self.searching_by_id()
            elif choice == 7:
                self.searching_by_fullname()
            elif choice == 8:
                self.searching_by_phone()
            elif choice == 9:
                self.display_all()
            elif choice == 10:
                print("Exiting...")
                sys.exit(0)
            else:
                print("Invalid choice. Please try again.")
                self.first_display()
                
        except ValueError:
            print("Please enter a valid number.")
            self.first_display()


# Example usage
if __name__ == "__main__":
    # Start the login system
    login_system = Login()
    
# admin.py
import mysql.connector
from mysql.connector import Error

class Admin:
    def __init__(self):
        self.name = ""
        self.username = ""
        self.password = ""
        self.phone = ""
        self.email = ""
        self.address = ""
        self.role = ""
        self.security_code = ""
        self.con = None
        self.cursor = None
        self.get_connection()

    # Database connection
    def get_connection(self):
        try:
            self.con = mysql.connector.connect(
                host='127.0.0.1',
                database='carsrecingotion',
                user='root',
                password=''
            )
            if self.con.is_connected():
                self.cursor = self.con.cursor()
                print("Connected to the database successfully (Admin)")
        except Error as e:
            print(f"Error: {e}")

    # Setters and Getters
    def set_information(self, name, username, password, security_code, phone, email, address, role):
        self.name = name
        self.username = username
        self.password = password
        self.security_code = security_code
        self.phone = phone
        self.email = email
        self.address = address
        self.role = role

    def get_name(self): return self.name
    def get_username(self): return self.username
    def get_password(self): return self.password
    def get_security_code(self): return self.security_code
    def get_phone(self): return self.phone
    def get_email(self): return self.email
    def get_address(self): return self.address
    def get_role(self): return self.role

    # CRUD operations
    def create_person(self):
        try:
            sql = ("INSERT INTO employee (Name, username, password, SecurityCode, Phone, Email, Address, Role) "
                   "VALUES (%s, %s, %s, %s, %s, %s, %s, %s)")
            values = (self.name, self.username, self.password, self.security_code, self.phone, self.email, self.address, self.role)
            self.cursor.execute(sql, values)
            self.con.commit()
            print("Account created successfully by Admin")
        except Error as e:
            print(f"Error: {e}")

    def update_person(self, employee_id, name, phone, email, address, role):
        try:
            sql = ("UPDATE employee SET Name=%s, Phone=%s, Email=%s, Address=%s, Role=%s WHERE EmployeeID=%s")
            values = (name, phone, email, address, role, employee_id)
            self.cursor.execute(sql, values)
            self.con.commit()
            if self.cursor.rowcount > 0:
                print("Update successful! (Admin)")
            else:
                print("No record updated. Please check Employee ID.")
        except Error as e:
            print(f"Error: {e}")

    def delete_person(self, employee_id):
        try:
            sql = "DELETE FROM employee WHERE EmployeeID=%s"
            self.cursor.execute(sql, (employee_id,))
            self.con.commit()
            if self.cursor.rowcount > 0:
                print("Record deleted successfully by Admin!")
            else:
                print("No record found to delete. Check Employee ID.")
        except Error as e:
            print(f"Error: {e}")

    def display_detail(self):
        print("Employee Information:")
        print(f"Full name: {self.get_name()}")
        print(f"Phone number: {self.get_phone()}")
        print(f"Email: {self.get_email()}")
        print(f"Address: {self.get_address()}")
        print(f"Role: {self.get_role()}")

    def display_all(self):
        try:
            self.cursor.execute("SELECT * FROM employee")
            rows = self.cursor.fetchall()
            for row in rows:
                print("Employee Information:")
                print(f"Full name: {row[1]}")
                print(f"Phone number: {row[5]}")
                print(f"Email: {row[6]}")
                print(f"Address: {row[7]}")
                print(f"Role: {row[8]}")
                print("------------------------")
        except Error as e:
            print(f"Error: {e}")

    def search_by_id(self, employee_id):
        try:
            self.cursor.execute("SELECT * FROM employee WHERE EmployeeID=%s", (employee_id,))
            row = self.cursor.fetchone()
            if row:
                print("Employee Information:")
                print(f"Full name: {row[1]}")
                print(f"Phone number: {row[5]}")
                print(f"Email: {row[6]}")
                print(f"Address: {row[7]}")
                print(f"Role: {row[8]}")
            else:
                print(f"No record found with EmployeeID: {employee_id}")
        except Error as e:
            print(f"Error: {e}")

    def search_by_fullname(self, name):
        try:
            self.cursor.execute("SELECT * FROM employee WHERE Name=%s", (name,))
            row = self.cursor.fetchone()
            if row:
                print("Employee Information:")
                print(f"Full name: {row[1]}")
                print(f"Phone number: {row[5]}")
                print(f"Email: {row[6]}")
                print(f"Address: {row[7]}")
                print(f"Role: {row[8]}")
            else:
                print(f"No record found with Name: {name}")
        except Error as e:
            print(f"Error: {e}")

    def search_by_phone(self, phone):
        try:
            self.cursor.execute("SELECT * FROM employee WHERE Phone=%s", (phone,))
            row = self.cursor.fetchone()
            if row:
                print("Employee Information:")
                print(f"Full name: {row[1]}")
                print(f"Phone number: {row[5]}")
                print(f"Email: {row[6]}")
                print(f"Address: {row[7]}")
                print(f"Role: {row[8]}")
            else:
                print(f"No record found with Phone: {phone}")
        except Error as e:
            print(f"Error: {e}")
