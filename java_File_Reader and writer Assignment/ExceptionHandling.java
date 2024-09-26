import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.Reader;



//to read the log file and find out the word exception

class ExceptionHandling {
public static void main(String args[]) {
	if(args.length < 1 ){
		System.out.println("Invalid argument : file Path not given");
		System.out.println("Usage:java ExceptionHandling <LogfilePath> [logfilefile]");
		System.exit(1);
	}
	String inputFilePath = args[0];
	//String outputFilePath = "exceptions.txt";
	//FileReader reader= new FileReader(inputFilePath);//File Reader
	
	try(
		//FileWriter mywriter = new FileWriter("./output.txt");
		BufferedReader br = new BufferedReader(new FileReader(inputFilePath))){
	
	
		String line; 
		while((line = br.readLine())!= null) {
			//if(line.contains("Exception") || line.contains("Exception")) {
				//System.out.println("Line Detected :" + line);
				//mywriter.write(line);}
		System.out.println(line);}
			
			//}
		//mywriter.flush();
		//mywriter.close();
		
		
		
	}catch(Exception error) {
		error.printStackTrace();
	}
	
}
}