import java.util.Scanner;
import java.util.Arrays;
class sort{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int x,i,j;
int[] m=new int[]{1,1,1,1,0,0,1,0};
for(i=0;i<8;i++)
{	
	for(j=i+1;j<8;j++)
	{
	if(m[i]>m[j])
	{
		x=m[i];
		m[i]=m[j];
		m[j]=x;
	}
}	
}
for(i=0;i<8;i++)
{
	System.out.print(m[i]);
}
}
}