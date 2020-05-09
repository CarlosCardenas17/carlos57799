package carlitos;
import java.util.Scanner;

import java.text.DecimalFormat;

public class caso16s
{

	public static void main(String[] args) 
	{
		Scanner slc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat ("#.00");
		
		
		
		
	    System.out.print(" ingrese horas trabajadas: ");
	    float cantidad = slc.nextFloat();
	   
	    
	   
	    System.out.print("Ingrese la tarifa por hora: ");
	    float precio = slc.nextFloat();
	    
	    
	  

	   
	    float importe = cantidad * precio;
	    
	    float aumento = (float)(importe*0.05);//Aplicar CAST
	    
	    float sc = aumento + importe;
	    		
	
	    		
	   
	    
	    System.out.println("--------------------");
	    System.out.println("Resultados");
	    System.out.println("--------------------");
	    System.out.println("sueldo: " + importe);
	    System.out.println("bono: " + aumento); 
	    System.out.println("total:" + sc);
		System.out.println("Euros: " + importe * 3.24 );
	  		

	}

}


	

		

	
