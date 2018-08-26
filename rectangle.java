import java.util.Scanner;
class rectangle{
float x,y;
void CalculateArea(float l,float b)
{
x=l;
y=b;
float z=x*y;
System.out.println(z);
}
}
class mainclass{
public static void main(String[] args)
{
Scanner s=new Scanner (System.in);
float a=s.nextFloat();
float b=s.nextFloat();
rectangle r=new rectangle();
r.CalculateArea(a,b);
}
}