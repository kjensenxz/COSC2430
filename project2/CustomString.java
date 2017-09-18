/* CustomString
 * Kenneth B. Jensen
 * COSC 2430 // Introduction to Computer Science II
 * Section 501
 * Project 2
 * This program checks if a user-inputted string is a palindrome.
 * Architecture:
 * CustomString - adds helpful methods to a String, since java.lang.String is final
 *      and cannot be extended.
 * PalindromeDemo - entry to program; creates a CustomString and uses
 *      a method that operates on CustomStrings in the Palindrome class.
 * Palindrome - the actual palindrome-checking logic using the methods built into
 *      the CustomString class.
 */

public class CustomString {
	public static final int MAX_CHARS = 80;

	public String text;
	public int length;

	public CustomString() {

	}

	public CustomString(String s) {
		text = s;
		length = s.length();
	}

	public CustomString reverse() {
		return new CustomString(new StringBuilder(this.text).reverse().toString());
	}

	public String toString() {
		return text;
	}

	public CustomString getFirstHalf() {
		return new CustomString(this.text.substring(0,length/2));
	}

	public CustomString getLastHalf() {
		return new CustomString(this.text.substring(length/2+(length % 2 == 0 ? 0 : 1)));
	}

	public CustomString replaceAll(String regex, String replacement) {
		return new CustomString(this.text.replaceAll(regex, replacement));
	}

	public boolean equals(CustomString cs) {
		return this.text.equals(cs.text);
	}
}
