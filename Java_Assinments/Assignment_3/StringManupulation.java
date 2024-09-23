 Question 10
 Write a java class StringManupulation, which has methods to perform below actions
	 a. Count total numbers of characters.
	 b. Replace all occourances of a specific word,
	 c. Convert the sentence to upper case.
	 d. Reverse a string.
	 e. Find the longest word out of the sentence passed as argument. 
	 HINT  study the java String class, and go through the available methods.

	
class StringManupulation
{
	
	static void Count(String str)
	{
		int NumberOfCharacter = str.length();
			System.out.println(Number Of Character +NumberOfCharacter);
	}
	static void replace(String str)
	{
		String str2 = str.replaceAll(studying,studied);		
		System.out.println(Replaced...  +str2);
	}
	static void UpperCase (String str)
	{
		String str2 = str.toUpperCase();
	}
	static void reverse(String str)
	{
        String reversedStr = ;
        
        for (int i = str.length() - 1; i = 0; i--) 
		{
            reversedStr = reversedStr + str.charAt(i);
        }
        
        System.out.println(Original String  + str);
        System.out.println(Reversed String  + reversedStr);
    }
	static void longestword(String str)
	{  
        String[] words = str.split( );
        String longestWord = ;
        
        for (String word  words) 
		{
            if (word.length()  longestWord.length()) 
			{
                longestWord = word;
            }
        }
        System.out.println(longest word  + longestWord);
	}
	
	public static void main (String args[])
	{
        System.out.println(Original String studying the java String class);
		
		Count(studying the java String class);
		replace(studying the java String class);
		UpperCase(studying the java String class);
		reverse(studying the java String class);
		longestword(studying the java String class);
		
	}
	
	
}