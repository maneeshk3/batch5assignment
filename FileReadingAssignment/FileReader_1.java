// Read through the methodserver log provided, and find all the lines having Exceptin keyword in it.
// Preapare another txt file having all those lines along with the Line Number : 

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

class LogReader {

	public static void main(String args[]) 
	{
		if(args.length < 1 )
		{
			System.out.println("Invalid argument : file Path not given");
			System.out.println("Usage:java LogReader <LogfilePath>[logfilefile]");
			System.exit(1);
		}
		String inputFilePath =args[0];
		
		try
		{
		FileWriter mywriter = new FileWriter("./output.txt");
		BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
		String line;
		
		while((line = br.readLine())!=null) 
		{
			if(line.contains("Exception") || line.contains("exception")) 
			{
				mywriter.write(line + "\n");
			
			}
		}
		mywriter.flush();
		mywriter.close();	
		}catch(Exception error) 
		{
		error.printStackTrace();
		}
		
	}
}