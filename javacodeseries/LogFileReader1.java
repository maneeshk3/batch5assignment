package javacodeseries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogFileReader1 {
	public static void main(String[]args) {
		String logFilePath="E:\\ptc\\\\Windchill_11.0\\\\Windchill\\\\codebase\\\\myjavaprograms\\\\logreader\\";
		String outputFilePath="file.txt";
		
		try(BufferedReader br=new BufferedReader(new FileReader(logFilePath));
				PrintWriter pw=new PrintWriter(new FileWriter(outputFilePath))){
					String line;
					while((line=br.readLine())!=null) {
						if(line.toLowerCase().contains("Exception")) {
							pw.println(line);
						}
					}
				}
				catch(IOException e) {
					System.out.println("Error reading log file:"+e.getMessage());
				}
	}
	
}
