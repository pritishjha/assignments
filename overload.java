class print1
{
public void print(){
System.out.println("without any argument");
}
}

class print2 extends print1{
public void print(int x)
{
System.out.println("with one argument that is int: "+x);
}
public void print(float y)
{
	System.out.println("with one argument that is float: "+y);
}
}
                                          
class overload{
public static void main(String[] args){
print1 p1=new print1();
print2 p2=new print2();
p1.print();
p2.print(2);
p2.print(2.3f);
}
}