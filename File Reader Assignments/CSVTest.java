import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CSVTest {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Usage: java CSVTest <inputFilePath>");
            return;
        }

        // File paths
        String inputFilePath = args[0]; // Input log file path from command-line argument
        String outputFilePath = "CSVgen.txt"; // Output file path

        // Try-with-resources to ensure resources are closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String data;

            // Read each line from the input file
            while ((data = reader.readLine()) != null) {
                String csvLine = replaceCommaWithDollar(data);
                writer.write(csvLine);
                writer.newLine();
            }

            System.out.println("Filtered lines written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to replace commas with dollar signs
    private static String replaceCommaWithDollar(String data) {
        return data.replace(",", "$");
    }
}
