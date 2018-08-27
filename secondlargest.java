import java.util.*;

public class SecondLargest

{
	
   public static void main(String[] args)

   {


        int arr [] = new int[10];

        int l = arr[0];

        int sl = arr[0];

        for(int i = 0 ; i < 10 ; i++)

        {
          Scanner ss = new Scanner (System.in);

          int a = ss.nextInt();
          
          arr[i] = a;
		
        }
		
        for (int i = 0; i < 10 ; i++)
 
       {
       
            if (arr[i] > l)
               
            {
	
	   sl = l;
	
	   l = arr[i];
          
            } 
     
          else if (arr[i] > sl)
 
            {
		
                    sl = arr[i];
    
            }
		
}
 
		
   System.out.println("\nSecond largest number is:" + sl);
 
}

}