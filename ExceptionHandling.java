import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		if(args.length<1) {
			System.out.println("Invalid file path not given");
			System.exit(1);
		}
		String inputpath = args[0];
		ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
		try {
			FileWriter writer = new FileWriter("./output.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(inputpath));
			String line;
			while((line = br.readLine()) != null) {
				String[] arr = line.split(",");
				if(line.contains("Exception")||line.contains("exception")) {
					System.out.println("Line Detected : " + line);
					writer.write(line + "\n");
				}
			}
			System.out.println("File writer closed");
			writer.flush();
			writer.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}

