/*Question 10:
Write a java class StringManupulation, which has methods to perform below actions
	a. Count total numbers of characters.
	b. Replace all occourances of a specific word,
	c. Convert the sentence to upper case.
	d. Reverse a string.
	e. Find the longest word out of the sentence passed as argument. 
	HINT : study the java String class, and go through the available methods.
 */

public class StringOperations {

    // a. count total number of characters
    public static int countCharacters(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    // b. replace all occurrences of a specific word
    public static String replaceWord(String str, String oldWord, String newWord) {
        if (str == null || oldWord == null || newWord == null) {
            return str;
        }
        return str.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    // c. convert the sentence to upper case
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    // d. reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // e. find the longest word out of the sentence
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }
        
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        /*for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > longestWord.length()) {
            longestWord = word;
            }
        }
        */
        
        return longestWord;
    }

    // main method for testing
    public static void main(String[] args) {
        String testSentence = "this is a sample program to ecxececute string operations";

        System.out.println("tehe given sentence is " + testSentence);
        System.out.println("1. total characters  " + countCharacters(testSentence));
        System.out.println("2. replace 'ecxececute' with 'excecute': " + replaceWord(testSentence, "ecxececute", "excecute"));
        System.out.println("3. uppercase  " + toUpperCase(testSentence));
        System.out.println("4. reversed: " + reverseString(testSentence));
        System.out.println("5. longest word: " + findLongestWord(testSentence));
    }
}