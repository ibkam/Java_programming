package ibkamcodes;
// Java program that analyse input text and returns word count,
// character count, common words and palindrome words
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class TextAnalyzer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text: ");
		
		String text = scan.nextLine();
		
		//calling functions
		int countedWords = wordCount(text);
		System.out.println("word counts: " + countedWords);
	
		int character_in_text = characterCount(text);
		System.out.println("Characters count: " + character_in_text);
		
		String commonWord =  mostFrequentWord(text);
		System.out.println("Most common word: " + commonWord);
		
		List<String> palindromic_words = findPalindromicWords(text);
		System.out.println("Palindomic words: " + palindromic_words);
		scan.close();
	}
	
	// word count function
	public static int wordCount(String text) {
		String[] word = text.split("[\\p{Punct}\\s]+");
		return word.length;
	}
	
	// counts characters by removing punctuation marks and spaces
	public static int characterCount(String text) {
		text = text.replaceAll("[\\s.,!?]", "");
		return text.length();
	}
	// return common words
	public static String mostFrequentWord(String text) {
		String[] words = text.split("[\\p{Punct}\\s]+");
		Map<String, Integer> wordFrequency = new HashMap<>();
		
		for (String word : words) {
			word = word.toLowerCase();
			wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
		}
		String mostCommonWord = "";
		int maxFrequency = 0;
		
		///traverse through the map 
		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
			if (entry.getValue() > maxFrequency) {
				mostCommonWord = entry.getKey();
				maxFrequency = entry.getValue();
			}
		}
		return mostCommonWord;
	}
	// return palindrome
	public static List<String> findPalindromicWords(String text) {
		String[] words = text.split("[\\p{Punct}\\s]+");
		List<String> palindromicWords = new ArrayList<>();
		
		for (String word : words) {
			word = word.toLowerCase();
			
			if (isPalindrome(word)) {
				palindromicWords.add(word);
			}
		}
		return palindromicWords;
		
	}
	// return boolean 
	public static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;
		
		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
		
}

