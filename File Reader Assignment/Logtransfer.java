import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Logtransfer{
    
    
    public static void main(String args[]){
        File readfile = new File("NewException.txt");  //File name of log file.
        File outputfile = new File("OnlyException.txt");   //File name of log file with only exception keyword.
        
        String line;
        int linenumber = 1;
        
        //read the log file.
        try{
            if (readfile.exists()){
                System.out.println("Read File alread exists.");
            }else{
                System.out.println("Read File does not exist check the log path.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //check the output file and create it.
        try{
            if (outputfile.exists()){
                System.out.println("Output File alread exists");
            }else{
                outputfile.createNewFile();
                System.out.println("Output file created.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        //Read the log files and write it to output file.
        try (BufferedReader reader = new BufferedReader(new FileReader(readfile));
            FileWriter writer = new FileWriter(outputfile)){
                
                while ((line = reader.readLine()) != null) {
                if (line.contains("Exception")||line.contains("exception")) {
                    writer.write("Line " + linenumber + ": " + line + System.lineSeparator());
                }
                linenumber++;
            }

            System.out.println("Finished Reading the file.");
                
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}