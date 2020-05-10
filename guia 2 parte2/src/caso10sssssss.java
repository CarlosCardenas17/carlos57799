import java.util.Scanner;
public class caso10sssssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner slc = new Scanner(System.in);
		
		
		String alumno = "";
		
		System.out.print("Ingrese nombre de alumno: ");
		alumno = slc.nextLine();
		
		System.out.print("Ingrese su sueldo por hora  porfavor: ");
		int cantidad = slc.nextInt();
		
		System.out.print("Ingrese horas trabajadas: ");
	     int horas = slc.nextInt();
	 
	
	     float er = (float)cantidad * horas;
	     float oi =(float) 0.13 * er;
	     
	    float es =(float) horas / 70;
	    float oo =(float) es * 100;
	    
	   float yo =(float) horas / 70;
   	float el =(float) yo * 100;
	    
   	float ui = (float)0.04 * er;

	  
	
	     
	     if(horas >= 70){
	    	 System.out.println("Importe: " + er);
	         System.out.print("Bono : " + oi);
	    	 
	    	 
	    	 System.out.print("meta alcansada  : " + oo);
	     }
	        else{
	        	System.out.println("Importe: " + er);
	        	
	        	System.out.println("Bono es  : " + ui);
	        	
		    	 System.out.println("meta no alcansada  : " + el);
	        	
		     }
	        	
	        	
	    	 
	    	 
	    	 
	    	 
	     }
	
	
	
}

