package ddt.alg.ds;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void shouldCheckIfWordIsAPalindrome() {
		assertTrue(Palindrome.isPalindrome("lol"));
		assertFalse(Palindrome.isPalindrome("lolada"));
		assertTrue(Palindrome.isPalindrome("lool"));
	}
	
	@Test
	public void shouldCheckIfWordIsAPalindromeRecursively() {
		assertTrue(Palindrome.isPalindromeRecursively("lol"));
		assertFalse(Palindrome.isPalindromeRecursively("lolada"));
		assertTrue(Palindrome.isPalindromeRecursively("lool"));
	}

}
