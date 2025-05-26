import mysql.connector
from mysql.connector import Error


def insert_plate_text(plate_value):
    try:
        # 1. Establish Connection
        conn = mysql.connector.connect(
            host='127.0.0.1',
            user='root',
            password='',
            database='carsrecingotion'
        )

        cursor = conn.cursor()


        # 2. Insert Data
        insert_query = "INSERT INTO plate_ocr (plate_text) VALUES (%s)"
        cursor.execute(insert_query, (plate_value,))  # <-- Tuple with comma
        conn.commit()
        print(f"Successfully inserted: {plate_value}")

        # 3. Verify Insertion (Optional)
        cursor.execute("SELECT * FROM plate_ocr")
        print("\nCurrent Table Data:")
        for row in cursor.fetchall():
            print(row)

    except Error as e:
        print(f"MySQL Error: {e}")
 