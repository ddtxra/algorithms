package ddt.alg.ds;

public class Palindrome {

	/**
	 * Checks in a word is a palindrome
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isPalindrome(String word) {
		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if a word is a palindrome using recursion
	 * @param word
	 * @return
	 */
	public static boolean isPalindromeRecursively(String word) {
		if (word.length() == 0 || word.length() == 1)
			return true;
		if (word.charAt(0) == word.charAt(word.length() - 1))
			return isPalindromeRecursively(word.substring(1, word.length() - 1));
		return false;
	}

}
