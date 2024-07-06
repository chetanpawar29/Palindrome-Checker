package com.cognifyz.palindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
	//method for check string is Palindrome
	public static boolean palindromeChecker(String str)
	{
		int n = str.length();
		int count=0;
		for(int i=0; i<n/2; i++)
		{
			if(str.charAt(i)==str.charAt(n-1-i))
			{
				count++;
			}
		}
			
		if(count == n/2 || count == (n/2)+1)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n ----->>> Welcome to Palindrome Checker <<<----- ");
	do
	 {
		System.out.print("\nEnter String for checking which is Palindrome or not : ");
		String str = sc.nextLine();
			
		if(palindromeChecker(str))
		{
			System.out.println();
			System.out.println("\tGiven String is Palindrome.");
		}else{
			System.out.println();
			System.out.println("\tGiven String is not Palindrome.");
		}
		char ch;
		System.out.print("\nDo you want to continue (y/n): ");
		ch = sc.next().charAt(0);
		if(ch=='N' || ch=='n')
		{
			System.out.println("\n\tExit");
			break;
		}
		sc.nextLine();

	 }while(true);
	}

}
