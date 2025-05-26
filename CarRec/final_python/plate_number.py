
import easyocr
import cv2
import os
import time
from db import insert_plate_text  # Import the function to insert plate text into the database


reader = easyocr.Reader(['en'])  

harcascade = "model/haarcascade_russian_plate_number.xml"
plate_cascade = cv2.CascadeClassifier(harcascade)

save_dir = "plates"
os.makedirs(save_dir, exist_ok=True)


cap = cv2.VideoCapture(0)
cap.set(3, 640)  
cap.set(4, 480)   

min_area = 500
cooldown_sec = 2
last_save_time = 0
count = 0   

while True:
    success, img = cap.read()
    if not success:
        break

    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    plates = plate_cascade.detectMultiScale(gray, 1.1, 4)
    current_time = time.time()
    
    for (x, y, w, h) in plates:
        area = w * h
        if area > min_area:
            cv2.rectangle(img, (x, y), (x+w, y+h), (0,255,0), 2)
            cv2.putText(img, "Number Plate", (x,y-10), 
                       cv2.FONT_HERSHEY_SIMPLEX, 0.5, (0,0,255), 2)

            if (current_time - last_save_time) >= cooldown_sec:
                plate_roi = img[y:y+h, x:x+w]
                
                # Save the plate image
                filename = os.path.join(save_dir, f"plate_{count}.jpg")
                cv2.imwrite(filename, plate_roi)
                
                # OCR PROCESSING 
                results = reader.readtext(plate_roi)  # Use the ROI image
                if results:
                    plate_text = results[0][1]
                    print(f"Detected: {plate_text}")
                    insert_plate_text(plate_text)  # Insert into the database
                    
                    cv2.putText(img, plate_text, (x, y+h+20), 
                               cv2.FONT_HERSHEY_SIMPLEX, 0.7, (0,255,0), 2)
                
                count += 1
                last_save_time = current_time

    cv2.imshow("Detection", img) 
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break



cap.release()
cv2.destroyAllWindows()