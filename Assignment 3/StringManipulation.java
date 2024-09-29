public class StringManipulation {

    // Method to count total number of characters in a string
    public int countCharacters(String sentence) {
        return sentence.length(); // Returns the length of the string
    }

    // Method to replace all occurrences of a specific word
    public String replaceWord(String sentence, String target, String replacement) {
        return sentence.replaceAll(target, replacement); // Replaces target with replacement
    }

    // Method to convert the sentence to upper case
    public String toUpperCase(String sentence) {
        return sentence.toUpperCase(); // Converts to upper case
    }

    // Method to reverse a string
    public String reverseString(String sentence) {
        return new StringBuilder(sentence).reverse().toString(); // Uses StringBuilder to reverse
    }

    // Method to find the longest word in a sentence
    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); // Split sentence into words
        String longestWord = ""; // To store the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update longest word
            }
        }
        return longestWord; // Return the longest word
    }

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();
        String sentence = "The quick brown fox jumps over the lazy dog";

        // Count characters
        int characterCount = sm.countCharacters(sentence);
        System.out.println("Total number of characters: " + characterCount);

        // Replace word
        String replacedSentence = sm.replaceWord(sentence, "lazy", "energetic");
        System.out.println("Replaced Sentence: " + replacedSentence);

        // Convert to upper case
        String upperCaseSentence = sm.toUpperCase(sentence);
        System.out.println("Upper Case Sentence: " + upperCaseSentence);

        // Reverse the string
        String reversedSentence = sm.reverseString(sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);

        // Find the longest word
        String longestWord = sm.findLongestWord(sentence);
        System.out.println("Longest Word: " + longestWord);
    }
}
