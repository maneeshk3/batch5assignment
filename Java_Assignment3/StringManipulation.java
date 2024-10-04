public class StringManipulation {

    // Method to count total number of characters
    public static int countCharacters(String str) {
        return str.length();
    }

    // Method to replace all occurrences of a specific word
    public static String replaceWord(String str, String oldWord, String newWord) {
        return str.replaceAll(oldWord, newWord);
    }

    // Method to convert sentence to upper case
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Method to find the longest word
    public static String findLongestWord(String str) {
        String[] words = str.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String originalStr = "The quick brown fox jumps over the lazy dog";

        // Count total number of characters
        System.out.println("Total Characters: " + countCharacters(originalStr));

        // Replace all occurrences of a specific word
        String replacedStr = replaceWord(originalStr, "fox", "cat");
        System.out.println("Replaced String: " + replacedStr);

        // Convert sentence to upper case
        String upperCaseStr = toUpperCase(originalStr);
        System.out.println("Upper Case String: " + upperCaseStr);

        // Reverse a string
        String reversedStr = reverseString(originalStr);
        System.out.println("Reversed String: " + reversedStr);

        // Find the longest word
        String longestWord = findLongestWord(originalStr);
        System.out.println("Longest Word: " + longestWord);
    }
}