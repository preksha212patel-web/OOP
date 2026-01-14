/** Practical 6

Problem Statement:
Write a Java program that accepts a five-digit integer from the keyboard. Your program
should then create a new number by adding one to each digit of the input number. For
example, if the input is 12391, the output should be 23402 (note: 9+1=10, so it becomes 0
with a carry) */





import java.util.Scanner;
class P6
{
   public static void main(String args[])
	{
		System.out.print("Enter a 5 digit Number:");
  		Scanner s1 = new Scanner(System.in);
		int a;
		a=s1.nextInt();
		int digit=0,temp,num=0,flag=1,n=5;
		temp=a;
		int b;
		b=a/10;
		if(b<1000 || 10000<b)
		{
		    System.out.print("Entered Number is not containing 5 digits.");	
}
		else
		{
		for(int i=0;i<n;i++)
		{
		 digit=temp%10;
		 temp=temp/10;

                 if(digit==9){    //12396 
 	         num=num+flag*10;
                 digit=temp%10;
		 temp=temp/10;
		 digit=digit*flag*10;   
 	         num=num+digit;
		flag*=100;
		n=4;
                continue;
          }
               else{
		 digit++;
		 digit=digit*flag;   
 	         num=num+digit;
		 flag=flag*10;
		}}
                 System.out.print(num);
			}		
			}
}