package carlitos;
import java.util.Scanner;
import java.text.DecimalFormat;

public class caso15
{

	public static void main(String[] args) 
	{
		Scanner slc = new Scanner(System.in);
		

		
		DecimalFormat df = new DecimalFormat ("#.00");
		
		
		
	    System.out.print("Ingrese cantidad: ");
	    float cantidad = slc.nextFloat();
	   
	    
	   
	    System.out.print("Ingrese precio: ");
	    float precio = slc.nextFloat();
	    
	    
	  

	    float importe , aumento, disminuido;
	    float importe1 = cantidad * precio;
	   
	    
	    System.out.println("--------------------");
	    System.out.println("Resultados");
	    System.out.println("--------------------");
	    System.out.println("Importe: " + df.format(importe1));
	    System.out.println("Dolar: " + importe1 / 3.24);  
		System.out.println("Euros: " + importe1 / 3.75);
	  		

	}

}


	
