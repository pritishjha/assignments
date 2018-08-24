import java.util.Scanner;
class leapyr{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a year");	
	int x=s.nextInt();
	int i,temp=0;
	if(x%4==0)
	{ if(x%100==0)
		{ if(x%400==0)
			temp=1;
		else
			temp=0;
		}
		else 
			temp=1;
	}
		else
			temp=0;
	if(temp==1)
		System.out.println("year is leap");
	else 
		System.out.println("year is not leap");
	
}
}