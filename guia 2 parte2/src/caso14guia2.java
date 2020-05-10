
	import java.text.DecimalFormat;
		
		import java.util.Scanner;
		public class caso14guia2 
		{

			public static void main(String[] args) 
			{
				Scanner sus = new Scanner(System.in);
				
			
				int numerodia = 0;
				int numer = 0;
				
				String ner = "";
				 System.out.println("Escoge una carrera:--DESARROLLO DE SOFTWARE---REDES Y CONECTIVIDAD---DISEO GRAFICO : ");
				  ner    = sus.nextLine();
				
				
					
				
				
				  String nar = "";
				    System.out.println("Elige el turno de tu carrera: MAÑANA-TARDE-NOCHE ");
				    nar = sus.nextLine();
				    

				
					
				
				    System.out.println("Esoge el numero que indica tu carrera");
				    System.out.println("carreras:......1-Desarrollo de software......2-Redes y conectividad......3-Diseño grafico");
				
				System.out.print("Ingrese número[1-3]: ");
				numerodia = sus.nextInt();
				
				
				float DESALL = 1500;
				float REDES = 1400;
				float Diseño = 1300;
				
				
				String nombredia = "";
				
				switch (numerodia) {
				    case 1:
				    nombredia : System.out.println("el monnto a pagar es : " + DESALL );System.out.println("DESARROLLO DE SOFTWARE" );
						
				    break;
				    case 2:
				    nombredia : System.out.println("el monnto a pagar es : " + REDES );System.out.println("REDES Y CONECTIVIDAD" );
				    break;
				    case 3:
				    nombredia : System.out.println("el monnto a pagar es : " + Diseño );System.out.println(" DISEÑO GRAFICO ");
				    break;
				
				}
				    
				    System.out.println("turnos desrrollo 3-5,,turnos Redes 5-8,,turnos Diseño grafico tarde 8-11");
				    System.out.println("Desarrollo de softwrare:......3-turno mañana.....4-turno tarde......5-turno noche"  );
				    System.out.println("Redes y conectividad:.........6-turno mañana.....7-turno tarde.......8-turno noche");
				    System.out.println("Diseño grafico :..............7-turno mañana.....8-turno tarde.......9-turno noche");
					   
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    System.out.print("Ingrese el número que indica el turno que eligiste ,de tu carrera [3-11]: ");
					numer = sus.nextInt();
					
					DecimalFormat df = new DecimalFormat("·00");
				    
					//DEsarrollo de software
					float mañana = (float) ((float)1500 * 0.1);
					float mae    =  1500 - 150;
				    float tarde = (float) ((float) 1500 * 0.2);
				    float miau = 1500 - 300;
				    float noche = (float) ((float) 1500 * 0.15);
				  float sau =  1500 - 225;
				  
				    //Redes y conectividad
				    float MAÑANA =(float) ((float)1400 * 0.1);
				    float oeis = 1400 - 140;
				    float TARDE =(float) ((float)1400 * 0.2);
				    float et = 1400 - 280;
				    float NOCHE =(float) ((float)1400 * 0.15);
				    float eto = 1400 - 210;
				    //Diseño grafico
				    float enlamañana =(float) ((float)1300 * 0.1);
				    float are = 1300 - 130;
				    float enlatarde =(float) ((float)1300 * 0.2);
				    float eere = 1300 - 260;
				    		 
				    float enlanoche =(float) ((float)1300 * 0.15);
				    float oci = 1300 - 195;
				    
				    String eres = "";
					
					switch (numer) { 
				    
				    
				    
				    case 3:
				    	eres : System.out.println("En turno mañana hay un descuento : " + mañana );System.out.println("monto total a pagar: " + mae );
				    	break;
				    case 4:
				    	eres : System.out.println("En turno tarde hay un descuento : " + tarde );System.out.println("monto total a pagar: " + miau );
				    	break;
				    case 5:
				    	eres :System.out.println("En turno noche hay un descuento : " + noche );System.out.println("monto total a pagar: " + sau );
				    	break;
				    case 6:
				    	eres :System.out.println("En turno mañana hay un descuento de : " + MAÑANA );System.out.println("monto total a pagar: " + oeis );
				    	break;
				    case 7:
				    	eres :System.out.println("En turno Tarde hay un descuento de : " + TARDE );System.out.println("monto total a pagar: " + et );
				    	break;
				    case 8:
				    	eres :System.out.println("En turno noche hay un descuento de : " + NOCHE );System.out.println("monto total a pagar: " + eto );
				    	break;
				    case 9:
				    	eres :System.out.println("EN turno mañana hay un descuento de : " + enlamañana );System.out.println("monto total a pagar: " + are );
				    	break;
				    case 10:
				    	eres :System.out.println("En turno tarde hay un descuento de : " + enlatarde );System.out.println("monto total a pagar: " +  eere );
				    	break;
				    case 11:
				    	eres :System.out.println("En turno noche hay un descuento de : " + enlanoche );System.out.println("monto total a pagar: " + oci );
				    	break;
				 }
				}
				
		    }
	
