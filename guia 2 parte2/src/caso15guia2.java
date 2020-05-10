import java.text.DecimalFormat;
import java.util.Scanner;
public class caso15guia2 
{

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat ("#.00");
		Scanner sus = new Scanner(System.in);
		float rs = 0;
		float lñ = 0;
		int rsp = 0;
		int numeri = 0;
		int numerodia = 0;
		String persi = "";
		
		int rt = 0;
		System.out.print("Escoja los productos que comprara tabled--laptop--Monitor--Impresora:  ");
	     persi = sus.nextLine();
	    
	     
	     
	     
	     
	     System.out.println( "si va a pagar con tarjeta coloque el numero 2");

	      System.out.println( "isi va a pagar en efectivo coloque el numero 1");
	     
	      	
	    		  
	      System.out.print("Irepita dos veces  el numero que eligio:  ");
	    		   rs = sus.nextInt();	  
	     	  
	if(rs <= 1) {
		
			System.out.print("Ingrese número[1-4]: ");
			numerodia = sus.nextInt();
		System.out.println("Ingrese la cantidad  que comprara,, de los artefactos sque eligio:"  );
		rsp = sus.nextInt();
		
		float TB = 350;
         float er =(float)rsp * 350;
         float ña = (float)((float)er * 0.05);
         float yas = ña - er;
         

		float LT = 2300;
		float ir = (float)rsp * 2300;
		float ñu= (float) ((float)ir * 0.05);
		float yis = ir - ñu ;
		
		float MN = 850;
		float or = (float)rsp * 850;
		float ñe = (float) ((float)or * 0.05);
		float yes = or - ñe;
		
		float IM = 680;
		float era = (float)rsp * 680;
		float ño = (float)((float)era * 0.05);
		float yos = era - ño;
		
		

		
		String nombredia = "";
		switch (numerodia) {
	       
		  case 1 :
		    nombredia : System.out.println("precio de la Tablet : " + TB);System.out.println("cantidad: " + yas);
		
		    break;
		 case 2 :
		    nombredia : System.out.println("precio de la laptop : " + LT );System.out.println("REDES: " + yis );
		    break;
		    case 3:
		    nombredia : System.out.println("precio Mononitor de : " + MN);System.out.println(" DISEÑO: " + yes );
		    break;
		    case 4:
		ombredia : System.out.println("precio de la impresora : " + IM);System.out.println(" jhg: " + yos );
                break;
		}
        	if(lñ == 2) {
        		
        System.out.print("Ingrese número[1-4]: ");
			numeri = sus.nextInt();
		System.out.println("Ingrese la cantidad  que comprara,, de los artefactos sque eligio:"  );
		int Ma = sus.nextInt();
		
		float Table = 350;
       float x1 =(float)Ma * 350;
       float w1 = (float)((float)x1 * 0.12);
       float p1 = x1 + w1;
       

		float Lap = 2300;
		float x2 = (float)Ma * 2300;
		float w2= (float) ((float)x2 * 0.12);
		float p2 = x2 + w2 ;
		
		float Moni = 850;
		float x3 = (float)Ma * 850;
		float w3 = (float) ((float)x3 * 0.12);
		float p3 = x3 + w3;
		
		float IMPRE = 680;
		float x4 = (float)Ma * 680;
		float w4 = (float)((float)x4 * 0.12);
		float p4 = x4 + w4;
		
		

		
		String nombre = "";
		switch (numeri) {
	       
		  case 1 :
		    nombre: System.out.println("precio de la Tablet : " + Table);System.out.println("cantidad: " + p1);
		
		    break;
		 case 2 :
		    nombre : System.out.println("precio de la laptop : " + Lap );System.out.println("REDES: " + p2 );
		    break;
		    case 3:
		    nombre : System.out.println("precio Mononitor de : " + Moni);System.out.println(" DISEÑO: " + p3 );
		    break;
		    case 4:
			ombre : System.out.println("precio de la impresora : " + IMPRE );System.out.println(" jhg: " + p4 );
			break;
	  }
}

		}
	     }
	}
