package carlitos;


import java.util.Scanner;
import java.text.DecimalFormat;

public class caso17
{

	public static void main(String[] args) 
	{
		Scanner slc = new Scanner(System.in);
		

		
		DecimalFormat df = new DecimalFormat ("#.00");
		
		
	    System.out.print(" Numero de aprobados: ");
	    float Aproba = slc.nextFloat();
	   
	    
	   
	    System.out.print(" numero desaprobaods: ");
	    float Desaproba = slc.nextFloat();
	    
	    System.out.print(" numero de retirados: ");
	    float retirado = slc.nextFloat();
	   
	    float importe , aumento, disminuido;
	    float impor1  = Desaproba + retirado + Aproba;
	    
	    
	    System.out.println("--------------------");
	    System.out.println("Resultados");
	    System.out.println("--------------------");
	    System.out.println("Aprobados porcentaje: % " + Aproba / impor1 * 100); 
	    System.out.println("Desaprobados porcentaje:% " + Desaproba / impor1 * 100);
		System.out.println("Retirados porcentaje: % " + retirado / impor1 * 100);
	  		
	   }

	}




	

		

	

