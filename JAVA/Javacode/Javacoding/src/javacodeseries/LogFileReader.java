package javacodeseries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LogFileReader {

	public static void main(String[] args) {
		String logFilePath="E:\\ptc\\Windchill_11.0\\Windchill\\codebase\\myjavaprograms\\logreader\\pacakage javacodeseries;";
		
		try(BufferedReader br=new BufferedReader(new FileReader(logFilePath)))
		{
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("Error reading log file:"+e.getMessage());
		}
	}
}

	
