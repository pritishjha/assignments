
import java.util.Scanner;
class swap
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int[] myarr=new int[10];
for(int i=0;i<10;i++)
{
myarr[i]=s.nextInt();
}
int temp;
for(int i=0;i<10;i=i+2)
{
temp=myarr[i];
myarr[i]=myarr[i+1];
myarr[i+1]=temp;
}
for(int i=0;i<10;i++)
{
System.out.println(myarr[i]);
}
}
}