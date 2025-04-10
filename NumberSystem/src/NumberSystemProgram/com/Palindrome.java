package NumberSystemProgram.com;
import java.util.*;
public class Palindrome {
public void palindromeNumber() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Number");
	int n=sc.nextInt();
	int originalNum=n;
	int reversedNum=0;
	while(n!=0) {
		int digit=n%10;
		reversedNum=reversedNum*10+digit;
		n=n/10;
	}
	if(originalNum==reversedNum) {
		System.out.println("Number is palindrome number");
	}
	else
	{
		System.out.println("Number is not palindrome number");
	}
}
public static void main(String[] args) {
	Palindrome k=new Palindrome();
	System.out.println("This Is A Palindrome Probelm");
	k.palindromeNumber();
}
}
