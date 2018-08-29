import java.util.*;
final class A{  
void display(){
System.out.println("Class A");
}                                       
}            
class B extends A{  
void display()
{
System.out.println("Class B");
}                                       
}
class extend
{
public static void main(String args[]){  
B s= new B(); 
s.display();
}
}