import java.io.*;

public class CSVDelimiterChanger {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CSVDelimiterChanger <input_file_path> <output_file_path>");
            System.exit(1);
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Replace comma with $
                String modifiedLine = line.replace(',', '$');
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("File processed successfully. Output written to: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
         }
     }
}
