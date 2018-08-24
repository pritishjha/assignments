import java.util.Scanner;
class pattern
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter limit:");
int n=s.nextInt();

int i,j;
for(i=1;i<=n;i++)
{
  for(j=1;j<i;j++)
  {
  System.out.print("*");
  }
  System.out.println();
  }
  }
  }