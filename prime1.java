import java.util.Scanner;
class prime{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,j;
System.out.println("enter the value for n");
int n=s.nextInt();
int temp;
for(i=2;i<n;i++)
{
	temp=0;
	for(j=2;j<i;j++)
	{
		if(i%j==0)
			temp=1;
	}
		if(temp==0){
			System.out.println(i);
	}		
}
System.out.println("are prime no. upto n");
}
}