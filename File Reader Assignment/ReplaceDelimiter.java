/*
Read a CSV file, and change the delimiter to choice of yours and write the updated data in another file.
*/
import java.io.*;
public class ReplaceDelimiter
{
	public static void main(String[] args) {
	    File readfile = new File("sample.csv");
	    File outputfile = new File("outfile.csv");
	    //FileReader reader = new FileReader(readfile);
	    String csvline;
	    String line;
	    try (BufferedReader reader = new BufferedReader(new FileReader(readfile));
            FileWriter writer = new FileWriter(outputfile)){
	        while((csvline=reader.readLine())!=null){
	       
	            line = csvline.replace(","," $$$ ");
	            System.out.println(line);
	            writer.write(line  + "\n" );
	            
	        }
	    }catch(IOException e){
	        e.printStackTrace();
	    }
		
	}
}