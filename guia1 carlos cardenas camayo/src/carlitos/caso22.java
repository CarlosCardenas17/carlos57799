package carlitos;



	
	import java.util.Scanner;

	import java.text.DecimalFormat;

	public class caso22
	{

		public static void main(String[] args) 
		{
			Scanner slc = new Scanner(System.in);
			


		
			
			DecimalFormat df = new DecimalFormat ("#.00");
			
		    
		   
		    System.out.print("Ingrese nota1: ");
		    float nu1 = slc.nextFloat();
		    
		    System.out.print("ingrese notta2: ");
		    float nu2 = slc.nextFloat();
		   
		    System.out.print("Ingrese nota3: ");
		    float nu3 = slc.nextFloat();
		    
		  

		
		    
		    float aumento = (float)(nu1*0.2);//Aplicar CAST
		    
		    float sed = (float)(nu2*0.3);//Aplicar CAST
		    
		    float sud = (float)(nu3*0.5);//Aplicar CAST
		 
		    float promedio = aumento + sed + sud;
		    
		   
		    
		    System.out.println("--------------------");
		    System.out.println("Resultados");
		    System.out.println("--------------------");
		    System.out.println("Promedio :" + promedio / 3);
		  		

		}

	}


