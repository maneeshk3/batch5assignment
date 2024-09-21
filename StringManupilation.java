public class StringManupilation {
	
	public int countChar(String str) {
		int count =0;
		for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
		return count;
	}
	public String replacementAll(String str, String target, String replacement) {
		return str.replace(target, replacement);
		}
	public String convertUpperCase(String str) {
		return str.toUpperCase();
	}
	public String reverseStr(String str) {
		return new StringBuilder(str).reverse().toString();
		}
	public String longestWord(String str) {
	String[] words = str.split("\\s+");
    String longestWord = "";
	for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }
    return longestWord;
}
	
	public static void main(String[] args) {
		StringManupilation obj = new StringManupilation();
		String str ="Hi good morning";
		System.out.println("Total number of Character : " + obj.countChar(str)); 
		System.out.println("Replaced : " + obj.replacementAll(str,"morning","afternoon")); 
		System.out.println("Upper case : " + obj.convertUpperCase(str));
		System.out.println("Reversed string : " + obj.reverseStr(str));
		System.out.println("Longest word : " + obj.longestWord(str));
	}

}
