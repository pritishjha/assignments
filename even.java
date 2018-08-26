import java.util.Scanner;
class even{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,j;
System.out.println("enter the value for n");
int n=s.nextInt();
for(i=1;i<=n;i++)
{
	if(i%2==0)
	{
	System.out.println(i);
	}
}
System.out.println("are even no. upto n");
}
}