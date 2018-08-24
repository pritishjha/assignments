import java.util.Scanner;
class palindrome{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");	
	int num=s.nextInt();
	 int rem=0,orig;
	orig=num;
	while(num>0){
	int x=num%10;
	rem=(rem*10)+x;
	num=num/10;
	}
		if(orig==rem)
	System.out.println("number is palindrome");
		else
	System.out.println("number is not palindrome");		
	
}
}
