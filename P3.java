/**Practical 3

Problem Statement:
Write a Java program that prompts the user to enter a single letter (character). Determine
whether the entered character is a vowel (a, e, i, o, u, case-insensitive) or a consonant, and
display the result.*/




import java.util.Scanner;
public class P3{
	public static void main(String args[]){
			
		char v;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a character:");
		v=sc.next().charAt(0);

		if( v == 'a' || v == 'A' || v == 'e' || v == 'E' || v == 'i' || v == 'I' || v == 'o' || v == 'O' || v == 'u' || v == 'U')
			System.out.println(v+" is a Vowel");
		else
			System.out.println(v+" is a Consonant ");


		sc.close();
	}
}																									