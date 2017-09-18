/* PalindromeDemo
 *
 * Kenneth B. Jensen
 * COSC 2430 // Introduction to Computer Science II
 * Section 501
 * Project 2
 *
 * This program checks if a user-inputted string is a palindrome.
 * 
 * Architecture:
 * Palindrome - the actual palindrome-checking logic using the methods built into
 * 	the CustomString class.
 *
 * PalindromeDemo - entry to program; creates a CustomString and uses
 * 	a method that operates on CustomStrings in the Palindrome class.
 *
 * CustomString - adds helpful methods to a String, since java.lang.String is final
 * 	and cannot be extended.
 */

public class Palindrome {
	public static boolean isPalindrome(CustomString phrase) {
		CustomString front, end;

		phrase = phrase.replaceAll("\\s", ""); // remove whitespace from parameter
		front = phrase.getFirstHalf();
		end = phrase.getLastHalf().reverse();

		return front.equals(end);
	}
}

