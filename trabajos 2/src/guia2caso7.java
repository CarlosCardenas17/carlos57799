
import java.util.Scanner;

public class guia2caso7 {

	public static void main(String[] args) {
		//Caso 7: Lea un sueldo y muestre el impuesto según la siguiente 
		//escala:  Hasta 1500, se aplica 3% sobre el sueldo.  
		//Más de 1500 – 3000,se aplica 8% sobre el sueldo. 
		//Más de 3000, se aplica 12% sobre el sueldo.
		

		Scanner slc = new Scanner(System.in);
		//paso1
		System.out.print("Ingrese su sueldo porfavor: ");
		int cantidad = slc.nextInt();
		//pàso2
		
        float porciento = 0;
        float porce = 0;
        float ore = 0;
	
		
		if(cantidad <= 1500) {
		porciento = (float)0.03 * cantidad;
		System.out.println("impuesto :" + porciento);
       
        }
        else{
        	if(cantidad <= 3000) {	
    	porce = (float)0.08 * cantidad;
    	System.out.println("impuesto : " + porce);
        	}
            else{
        ore = (float)0.12 * cantidad;
        System.out.println("impuesto : " + ore);
            }
    	
		
        }
		

   }

}




	
