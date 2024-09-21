import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.FileReader;

class ReadException {
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("Invalid argument : File Path not given");
			System.out.println("Usage : java ReadException <LogFilePath> [logfileFile]");
			System.exit(1);
		}
		
		String inputFilePath = args [0];
		
		try {
			FileWriter mywriter = new FileWriter("./output.txt");
			
		BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
			String line;
			while ((line = br.readLine()) != null) {
				if(line.contains("Exception") || line.contains("exception")) {
					System.out.println("Line Detected : " + line);
					mywriter.write(line + "\n");
				}
			}
			System.out.println("File writer closed,operation is complete");
			
			mywriter.close();
		}catch(Exception error) {
			error.printStackTrace();
		
		}
	}
}