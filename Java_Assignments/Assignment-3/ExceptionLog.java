package plm_Assignment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.*;
//import java.nio.file.*;
//import java.util.*;
//import java.io.File;

import java.io.FileNotFoundException; 

public class ExceptionLog {  
    public static void main(String[] args) {      
        // File path for the log file and for new file
        String filepath = "F:\\ptc\\Windchill_11.0\\Windchill\\codebase\\My_JavaAssignments\\Assignments\\src\\.log";
        String newFile = "F:\\ptc\\Windchill_11.0\\Windchill\\codebase\\My_JavaAssignments\\Assignments\\src\\new_file.txt";
        String keyword = "ENTRY"; // Keyword to search in log file

        try {
            // Process the log file to filter lines containing the keyword and write them to newFile
            processLogFile(filepath, newFile, keyword);
            System.out.println("Lines containing 'ENTRY' written to " + newFile);
        } catch (IOException e) {
            System.err.println("An error occurred while processing the log file: " + e.getMessage());
        }
    }

    // Method to process the log file and filter lines with the specified keyword
    public static void processLogFile(String filepath, String newFile, String keyword) throws IOException {
        // Path object for the source log file
        Path sourcePath = Paths.get(filepath);

        // Check if the source log file exists
        if (!Files.exists(sourcePath)) {
            throw new FileNotFoundException("Source file not found: " + filepath);
        }

        // Try-with-resources block to ensure proper resource management for file reading and writing
        try (BufferedReader br = Files.newBufferedReader(sourcePath);
             BufferedWriter bw = Files.newBufferedWriter(Paths.get(newFile), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            
            String line = "";
            // Read each line of the log file
            while ((line = br.readLine()) != null) {
                // Check if the line contains the specified keyword (case-insensitive)
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    // Write the line to the new file
                    bw.write(line);
                    bw.newLine();
                }
            }
        }
    }
}
