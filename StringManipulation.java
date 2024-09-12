/*
Write a java class StringManupulation, which has methods to perform below actions
	a. Count total numbers of characters.
	b. Replace all occourances of a specific word,
	c. Convert the sentence to upper case.
	d. Reverse a string.
	e. Find the longest word out of the sentence passed as argument. 
	HINT : study the java String class, and go through the available methods.

*/

public class StringManipulation {

    
    public static int wordcount(String word) {
        return word.length();
    }


    public static String replaceWord(String sentence, String oldword, String newword) {
        return sentence.replace(oldword, newword);
    }


    public static String toupper(String word) {
        return word.toUpperCase();
    }

    
    public static String reversestring(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    
    public static String LongWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
		
        String sentence = "Hi My Name is ABC";

        
        System.out.println(wordcount(sentence));

        
        String replacedSentence = replaceWord(sentence, "ABC", "XYZ");
        System.out.println(replacedSentence);

        System.out.println(toupper(sentence));

      
        System.out.println(reversestring(sentence));

        System.out.println(LongWord(sentence));
    }
}
