import java.util.Scanner;
class reverse1{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");	
	int num=s.nextInt();
	 int rev=0,orig;
	orig=num;
	while(num>0){
	int x=num%10;
	rev=(rev*10)+x;
	num=num/10;
	}
	System.out.println("reverse of number is: "+rev);
}
}