import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {


		Scanner slc = new Scanner(System.in);
		
		System.out.println("Ingrese una nota: ");
		int cantidad = slc.nextInt();
	
		
   
   
        

		if(cantidad <= 7) {
	
		System.out.print(" “Sin Palabras” ");
       
        }
        else{
        	if(cantidad <=10 ) {	
   
    	System.out.println("“Malo”");
        	}
            else{
            if(cantidad <= 14 ) {
            	System.out.println("“Regular”  ");		
            }
            else{
            if(cantidad <= 17 ) {
            System.out.println("Notable");		 
            	 
            }
            else{
            if(cantidad >= 20 ) {
            System.out.println("“Excelente”");

	         }

            }
           }
         }
       }
      }
	}
