class rectangle

{
    
     double len , bre;
  
     rectangle(double a ,double b)
 
    {
  
              this.len = a;
  
              this.bre = b;

     }
 
    double calculate_area()

    {

         return (len*bre);

    }

}

public class calculatearea

{

    public static void main(String args[])

    {
 
       rectangle rec = new rectangle(10,20);
      System.out.println("Area : " + rec.calculate_area());

 
    }
}