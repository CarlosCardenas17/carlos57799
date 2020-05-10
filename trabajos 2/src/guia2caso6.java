import java.util.Scanner;
public class guia2caso6
{ 

	public static void main(String[] args) 
	{
    //Lea un sueldo, si es superior a 2800, calcule el impuesto del 5% 
	//sobre el sueldo, caso contrario calcule el 2% sobre el sueldo.
		
			
				Scanner slc = new Scanner(System.in);
				//paso1
				System.out.print("Ingrese su sueldo porfavor: ");
				int cantidad = slc.nextInt();
				//pàso2
				
		        float porciento = 0;
		        float porce = 0;
			
				
				if(cantidad > 2800) {
				porciento = (float)0.05 * cantidad;
				System.out.println("impuesto,,,,,,,,,,,:" + porciento);
	           
	            }
                else{
                	
            	porce = (float)0.02 * cantidad;
				System.out.println("impuesto,,,,,,,,,,,:" + porce );
                }
				

		}

	}


