import java.util.Scanner;
public class guia2caso12 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		String empleado = "";
	
		
		System.out.print("Nombre de empelado: ");
		empleado = sc.nextLine();
		System.out.print("Nivel [1-4]: ");
		int nivel = sc.nextInt();
		
		System.out.print("sueldo: ");
		float sueldo = sc.nextFloat();
		
		float inc = 0;
		switch (nivel) {
		case 1 :
		     inc = 0.045f; 
		     break;
		case 2:
			inc = 6.0f; 
			break;
		case 3:
			inc = 8.5f; 
			break;
		case 4 :
			inc = 11.0f; 
		}
		
       float nuevosueldo = sueldo * (1+inc);
    	
		System.out.println("incremento: " + inc);
		System.out.println("sueldo nuevo: " + nuevosueldo);
	}
}
