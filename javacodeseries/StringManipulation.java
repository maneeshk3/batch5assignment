package javacodeseries;

public class StringManipulation {
	public int countCharacters(String sentence)
	{
		return sentence.length();
	}
	
	public String replaceWord(String sentence,String wordToReplace,String replacement) {
		return sentence.replaceAll(wordToReplace,replacement);
	}
	
	public String convertToUpperCase(String sentence) {
		return sentence.toUpperCase();
	}
	
	public String reverseString(String sentence)
	{
		StringBuilder reversed=new StringBuilder();
		for(int i=sentence.length()-1;i>=0;i--)
		{
			reversed.append(sentence.charAt(i));
		}
		return reversed.toString();
	}
	
	public String findLongestWord(String sentence) {
		String[]words=sentence.split("");
		String longestWord="";
		for(String word:words) {
			if(word.length()>longestWord.length()) {
				longestWord=word;
			}
		}
		return longestWord;
	}

	public static void main(String[]args) {
		StringManipulation manipulation=new StringManipulation();
		String sentence="Hello World,this is a test sentence.";
		
		int characterCount=manipulation.countCharacters(sentence);
		System.out.println("Total characters:"+characterCount);
		
		String replacedSentence=manipulation.replaceWord(sentence, "test","example" );
		System.out.println("Replaced sentence:"+replacedSentence);
		
		String upperCaseSentence=manipulation.convertToUpperCase(sentence);
		System.out.println("Upper case sentence:"+upperCaseSentence);
		
		String reversedSentence=manipulation.reverseString(sentence);
		System.out.println("Reversed sentence:"+reversedSentence);
		
		String longestWord=manipulation.findLongestWord(sentence);
		System.out.println("Longest word:"+longestWord);
				
		
	}
}

	