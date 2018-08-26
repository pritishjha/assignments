import java.util.Scanner;
class arraysearch{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int x,i,count=0;
int[] m=new int[]{1,4,6,7,8,9,10};
System.out.println("enter value to find");
x=s.nextInt();

for(i=0;i<7;i++)
{
	if(m[i]==x){
	count=1;
	break;
	}
}
if(count!=0)
System.out.println("value is present");
else
System.out.println("value is not present");

}
}