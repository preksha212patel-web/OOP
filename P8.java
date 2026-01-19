/** Practical 8

Problem Statement:
Write a Java program that accepts two numbers as command-line arguments. Convert these
arguments to appropriate numeric types (e.g., int or double), perform a simple
calculation(e.g., sum or product), and print the result to the console. */




import java.util.Scanner;
class P8
{
    public static void main(String args[])
	{
		
                int a=Integer.parseInt(args[0]);
		double d=Double.parseDouble(args[1]);
               System.out.println("Integer Number:"+a);
		System.out.println("Double Number:"+d);
		double sum=0;
		sum=a+d;
		System.out.println("Sum="+sum);
	}

	}