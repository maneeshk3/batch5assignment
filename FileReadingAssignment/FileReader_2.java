// Read a CSV file, and change the delimiter to choice of yours and write the updated data in another csv file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

class csv {

	public static void main(String args[]) 
	{
		if(args.length < 1 )
		{
			System.out.println("Invalid argument : file Path not given");
			System.out.println("Usage:java LogReader <LogfilePath>[logfilefile]");
			System.exit(1);
		}
		String inputFilePath =args[0];
		String currentDelimiter = ",";             
		String newDelimiter = "|$$|";  
		
		try
		{
		FileWriter mywriter = new FileWriter("./output2.txt");
		BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
		String line;
		
		while((line = br.readLine())!=null) 
		{
			String updatedLine = line.replace(currentDelimiter, newDelimiter);
			mywriter.write(updatedLine + "\n");
			
			
		}
		mywriter.flush();
		mywriter.close();	
		}catch(Exception error) 
		{
		error.printStackTrace();
		}
		
	}
}