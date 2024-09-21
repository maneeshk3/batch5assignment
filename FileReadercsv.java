import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadercsv {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Admin\\Downloads\\example.csv";  
        String outputFilePath = "C:\\\\Users\\\\Admin\\\\Downloads\\\\output.csv"; 
        String originalDelimiter = "#";        
        String newDelimiter = "$";            

        changeDelimiter(inputFilePath, outputFilePath, originalDelimiter, newDelimiter);
    }

    public static void changeDelimiter(String inputFilePath, String outputFilePath, 
                                       String originalDelimiter, String newDelimiter) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(originalDelimiter, -1);
                String newLine = String.join(newDelimiter, columns);
                writer.write(newLine);
                writer.newLine();
            }

            System.out.println("Delimiter changed successfully.");
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}
