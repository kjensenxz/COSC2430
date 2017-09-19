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
 * PalindromeDemo - entry to program; creates a CustomString and uses
 *      a method that operates on CustomStrings in the Palindrome class.
 *
 * CustomString - adds helpful methods to a String, since java.lang.String is final
 *      and cannot be extended.
 *
 * Palindrome - the actual palindrome-checking logic using the methods built into
 *      the CustomString class.
 */

import java.util.Scanner;
public class PalindromeDemo {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Input a phrase or press ^C to quit.\n> ");
			CustomString phrase = new CustomString(sc.nextLine());
			if (phrase.length > CustomString.MAX_CHARS) {
				System.out.println("Error: your input is greater than MAX_CHARS (80).");
			}
			else if (Palindrome.isPalindrome(phrase)) {
				System.out.println("YES, the phrase is a palindrome!");
			}
			else {
				System.out.println("NO, the phrase is NOT a palindrome!");
			}
		}
	}
}
