import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testing_stuff {

//public static void main(String[] args)         //-- You know what to do :)
    testing_stuff()
     {
        String fileName = "ASTRO-ascii.txt";

        // Read ASCII art from file and color it
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Color the line
                String coloredLine = "\u001B[36m" + line; // Yellow color - "\u001B[33m"  ,  Cyan color - "\u001B[36m" 
                System.out.println(coloredLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Reset color to default
        System.out.println("\u001B[0m"); // Resets color to default
    }
}






















// Old code -2
// Note : this code still works except there's a problem to read each and every line as it prints in an wrong manner 
//              Thus we have used the BufferedReader
//

/**
 * import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testing_stuff {
    public static void main(String args[]) {
        FileReader fr = null; // Declare FileReader outside the try block

        try {
            fr = new FileReader("file read test.txt"); // Initialize FileReader
            //int i;
           // String line = ""; // Initialize the line variable
            int character;
            String cyan = "\u001B[36m";
            String reset = "\\u001B[0m";
            while ((character = fr.read()) != -1) {
               
                // Print the character (ASCII art) to the console
                System.out.print(cyan +(char) character);
                
            }
            System.out.println(reset);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close(); // Close FileReader in the finally block
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

 * 
 * 
 * 
 * 
 */



















//Old code -1 
//
//
//
/**
 * import java.io.FileNotFoundException;
import java.io.FileReader;

public class testing_stuff {
    public static void main (String args[]) throws FileNotFoundException
    {   int i;
        FileReader fr = new FileReader("file read test.txt'");
        try {
            
            String line;
            while((i=fr.read()) != -1 ){
                line +=(char) i ;                 
                System.out.print(line);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        finally{
            fr.close();
        }
    } 
}

 * 
 * 
 * 
 * */ 