class complex

{
 
      int real , imag;

      complex(int a ,int b)
  
    {
  
              this.real = a;
      
        this.imag = b;
 
      }

     void display()
 
    {

        System.out.println(real + "+" + imag +"i");

     }

}

public class displaycomplex

{

      public static void main(String args[])
  
    {
 
          complex obj = new complex(1,2);

          obj.display();

      }

}