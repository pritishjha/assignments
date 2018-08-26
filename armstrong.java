import java.util.Scanner;
class armstrong{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n,orig,rem,res=0;
System.out.println("enter the value to check");
n=s.nextInt();
orig=n;
while(orig!=0)
{
rem=orig%10;
res=res+(rem*rem*rem);
orig=orig/10;
}
if(res==n)
	System.out.println("number is armstrong");
else
	System.out.println("number is not armstrong");

}
}