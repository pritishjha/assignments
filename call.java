class A
{
A()
{
System.out.println("Default Constructor");
}
A(int x)
{
this();
System.out.println(x);
}
}
class call
{
public static void main (String args[]){
  A s=new A(10);
}
}