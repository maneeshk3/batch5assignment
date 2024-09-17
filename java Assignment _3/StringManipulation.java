
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
		
        String sentence = "Hi My Name is Surya";

        
        System.out.println(wordcount(sentence));

        
        String replacedSentence = replaceWord(sentence, "surya", "virat");
        System.out.println(replacedSentence);

        System.out.println(toupper(sentence));

      
        System.out.println(reversestring(sentence));

        System.out.println(LongWord(sentence));
    }
}
