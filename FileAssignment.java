import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileAssignment {
    
    
    public static void main(String args[]){
        File rf = new File("EXCEPTIONFILE.txt");  
        File of = new File("OUTPUTFILE.txt");   
        
        String line;
        int ln = 1;
        
        
        try{
            if(rf.exists()){
            System.out.println("rf exists");
            }
            else{
                System.out.println("rf doesn't exists");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        
        try{
            if(of.exists()){
            System.out.println("of exists");
            }
            else{
                of.createNewFile();
                System.out.println("of created.");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(rf));
            FileWriter fw = new FileWriter(of)){
                
                while ((line=br.readLine()) != null) {
                if (line.contains("Exception")||line.contains("exception")) {
                    fw.write("Line " + ln + ": " + line + System.lineSeparator());
                }
                
                ln++;
            }

            System.out.println("Finished");
                
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}