import java.util.*;
class A
{
void function()
{
System.out.println("parent class");
}
}
class B extends A
{
void function()
{
System.out.println("child class");
}
void fun()
{
System.out.println("Calling Parent Class");
}  
void display(){ 
fun(); 
super.function();   
}  
}  
class invoke
{  
public static void main(String args[]){  
B s=new B();  
s.display();  
}
} 