/**Practical 4

Problem Statement:
Develop a Java application that calculates a person&#39;s Body Mass Index (BMI). The program
should ask the user for their weight in pounds and height in inches. Convert these values to
kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and
then calculate BMI (weight in kg / (height in meters) ^2). Display the calculated BMI.*/




import java.util.Scanner;
public class P4{
	public static void main(String args[]){
		float h,w;
		
		Scanner sc=new Scanner(System.in);		

		System.out.println("Enter your Height in Inches:");
		h=sc.nextFloat();

		System.out.println("Enter your Weight in Pounds:");
		w=sc.nextFloat();

		h*=0.0254;
		w*=0.45359237;

		System.out.println("Your BMI is: "+ (w/(h*h)));

		sc.close();
	}
}