import java.text.DecimalFormat;
import java.util.Scanner;


public class guia2caso9
{

	public static void main(String[] args) 
	{
		
		 //      Promedio: Considere el peso de 30% y 70% respectivamente.
		//        % Asistencias: Considere que son un total de 12 sesiones por curso.
		///   Estado: Considere que será Aprobado si el promedio es a partir de 13 y asistió como mínimo el 70%,
		//      caso contrario será Desaprobado. 
		//       Al final, muestre cada resultado obtenido.
		
		Scanner slc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		String alumno = "";
		int nota1 = 0, nota2 = 0;
		float asistencia = 0;
	 float oe = 0;
	 float is = 0;
	 float er = 0;

	
		System.out.print("Ingrese nombre de alumno: ");
		alumno = slc.nextLine();
		
		
		System.out.print("Ingrese la primera nota: ");
		nota1 = slc .nextInt();
		System.out.print("Ingrese segunda nota: ");
		nota2 = slc.nextInt();
	
		System.out.print("de 12 clases cuantas asisitencias tubo: ");
		asistencia = slc.nextInt();
		 
		System.out.println("ALUMNO: " + alumno);
		is = nota1 + nota2;
		oe= (float) is / 2 ;
		
		
		
		if(asistencia >=8) { 
			 is = (float)asistencia / 12;
		     er = (float)is * 100;
		System.out.println("porcentaje de Asistencias:% " + er );	
		}
         else {
     System.out.println("asistencias : DESAPROBO El CURSO  POR INACISTENCIAS ");
         
         }
            if(oe >= 13) { 
            	
            
            	System.out.println("RESULTADOS: APROBO");
            }
             else {
         System.out.println("RESULTADOS :  DESAPROB EL CURSO POR BBAJA NOTA  ");
             
 		
         
 	
 		
         }
         
         
	}
            
	}
         
	

            