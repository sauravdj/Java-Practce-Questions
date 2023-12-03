import java.io.*;

public class UppercaseFileConverter {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        
        try {
            // Ask user for input and output file names
           
            String inputFileName = System.console().readLine("Enter input file name: ");
            
            String outputFileName = System.console().readLine("Enter output file name: ");
            
            // Open input and output files
            reader = new BufferedReader(new FileReader(inputFileName));
            writer = new BufferedWriter(new FileWriter(outputFileName));
            
            // Read input file, convert to uppercase, and write to output file
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            
            // Close input and output files
            reader.close();
            writer.close();
            
            System.out.println("Conversion complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}