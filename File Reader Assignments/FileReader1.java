import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileReader1 {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Usage: java FileReader1 <inputFilePath>");
            return;
        }

        // File paths
        String inputFilePath = args[0]; // Input log file path from command-line argument
        String outputFilePath = "filtered_exceptions.txt"; // Output file path

        // Try-with-resources to ensure resources are closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            int lineNumber = 1;

            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Check if the line contains "Exception" or "exception"
                if (line.contains("Exception") || line.contains("exception")) {
                    // Write the line number and the complete line to the output file
                    writer.write("Line " + lineNumber + ": " + line);
                    writer.newLine(); // Write a new line in the output file
                }
                lineNumber++; // Increment line number for each line read
            }

            System.out.println("Filtered lines written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
