 /** Practical 5

Problem Statement:
Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787),
Calculate and display the minimum number of currency notes of denominations 100, 50, 10,
5, 2, and 1 that would be given to the user. */



import java.util.Scanner;
class P5
{
   public static void main(String args[])
	{
		System.out.print("Enter value of a:");
  		Scanner s1 = new Scanner(System.in);
		int a;
		a=s1.nextInt();
		int h=0,f=0,t=0,temp=0;
		if(a>=100){
		h=a/100;
		temp=a%100;
		f=temp/50;
		temp=temp%50;
		t=temp/10;
             }	
		else
	{
		f=a/50;
		temp=a%50;
		t=temp/10;
         }			
		System.out.println("No. of 100Rs. Note="+h);
		System.out.println("No. of 50Rs. Note="+f);
		System.out.println("No. of 10Rs. Note="+t);
	}
}