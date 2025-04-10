package NumberSystemProgram.com;
import java.util.*;
public class Armstrong {
Scanner sc=new Scanner(System.in);
public void armstrongNumber() {
	System.out.println("Enter Any Nymber You Want To Check");
	int n=sc.nextInt();
	int rem=0;
	int rev=0;
	for(int i=n;i!=0;i=i/10) {
		rem=i%10;
		rev=rev+(rem*rem*rem);
	}
	if(n==rev) {
		System.out.println("It Is Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong Number");
	}
	}


}