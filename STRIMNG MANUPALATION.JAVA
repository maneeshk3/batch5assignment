public class StringManipulation {

    // Method to count total number of characters in a string
    public int countCharacters(String input) {
        return input.length();
    }

    // Method to replace all occurrences of a specific word
    public String replaceWord(String input, String target, String replacement) {
        return input.replace(target, replacement);
    }

    // Method to convert the sentence to upper case
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Method to reverse a string
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to find the longest word in the sentence
    public String findLongestWord(String input) {
        String[] words = input.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
