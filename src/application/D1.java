package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {
    	Martyr<String> m = new Martyr(16);
        File f = new File("dm.csv");
        Scanner s1 = new Scanner(System.in);

        try {
            // Create a Scanner object to read the CSV file
            Scanner s = new Scanner(f);

            // Read each line of the CSV file
            while (s.hasNextLine()) {
                // Read the line
                String line = s.nextLine();

                // Print each line to the console
                System.out.println(line);
            }

            // Close the scanner
            s.close();

            // Append content to the file
            PrintWriter pw = new PrintWriter(new FileWriter(f, true));
            System.out.println("enter name to add");
            String add1 = s1.nextLine();
          
          //  pw.println(m.add(add1)); 
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
