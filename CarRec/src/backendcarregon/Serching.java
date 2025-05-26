/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backendcarregon;

import java.sql.*;
import java.util.Scanner;

public class Serching {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        try {
            while (running) {
                // Reconnect to the database on each iteration
                con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/carsrecingotion", 
                    "root", 
                    ""
                );

                // Query the database
                String sql = "SELECT * FROM test_zanyary WHERE plate_text IN (SELECT plate_text FROM plate_ocr)";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                // Process results
                boolean hasResults = false;
                while (rs.next()) {
                    hasResults = true;
                    String plateText = rs.getString("plate_text");
                    System.out.println("Found plate: " + plateText);
                }

                if (!hasResults) {
                    System.out.println("No new data found.");
                }

                // Cleanup resources for this iteration
                rs.close();
                pst.close();
                con.close();

                // Add delay (e.g., 5 seconds) before next check
                System.out.println("Waiting for next check...");
                Thread.sleep(5000); // 5000 ms = 5 seconds
            }
        } catch (SQLException | InterruptedException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            // Final cleanup
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
                scanner.close();
            } catch (SQLException ex) {
                System.out.println("Cleanup error: " + ex.getMessage());
            }
        }
    }
}