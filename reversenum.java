import java.util.Scanner;
class reveresenum
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int rev=0;
while(n!=0)
{
int digit=n%10;
rev=rev*10+digit;
n/=10;
}

        System.out.println("Reversed Number: "+rev);
		}
		}