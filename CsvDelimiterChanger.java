import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvDelimiterChanger {
    public static void main(String[] args) {
        String inputFilePath = "input.csv"; // Input CSV file path
        String outputFilePath = "output.csv"; // Output CSV file path

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                // Replace the delimiter from ',' to '$'
                String modifiedLine = line.replace(",", "$");
                // Write the modified line to the output file
                writer.write(modifiedLine);
                writer.newLine(); // Add a new line after each entry
            }

            System.out.println("Delimiter changed and data written to " + outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
