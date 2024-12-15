package taskno_02;

import java.util.Scanner;
import java.util.function.Predicate;

/*
 * Palindrome Checker
Develop a Java program that checks whether a given string is a palindrome or
not. Implement logic to prompt users to enter a string and determine if the
string reads the same forwards and backward (ignoring spaces and case
sensitivity). Display a message indicating whether the string is a palindrome
or not.
 */
public class PalindromeChecker {

	public static boolean isPallindrome(String str) {
		//using predicate interface to test given string is pallindrome or not
		Predicate<String> checkPallindrome = s -> new StringBuffer(s.trim()).reverse().toString()
				.equalsIgnoreCase(s.trim());
		
		return checkPallindrome.test(str);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();

		if (isPallindrome(str))
			System.out.println(str.trim() + " is a Pallindrome String");
		else
			System.out.println(str.trim() + " is not a Pallindrome String");
		
		sc.close();

	}

}
