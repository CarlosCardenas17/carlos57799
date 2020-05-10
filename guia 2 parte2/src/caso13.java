import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		//Caso 13: Lea los siguientes datos: numero1, numero2 y operación (1-6), se pide calcular:
			// Respuesta: según la operación será: o 1, calcule la suma de ambos números.
			//o 2, calcule la resta de ambos números. o 3, calcule el producto de ambos números.
			//o 4, calcule la división de ambos números siempre que el segundo número sea distinto de cero (0).
			//o 5, calcule el resto entero de ambos números siempre que el segundo número sea distinto de cero (0).
		//o 6, calcule el promedio de ambos números.

		Scanner sc = new Scanner (System.in);
		
	
		
		System.out.print("ingrese el primer numero: ");
		int empleado = sc.nextInt();
		System.out.print("ingrese el segundo numero: ");
		int emplis = sc.nextInt();
		
		System.out.print("Nivel [1-6]: ");
		int nivel = sc.nextInt();
		
		
		
		float oi = empleado + emplis;
		float ai = empleado - emplis; 
		float is = (float) empleado * emplis;
		float nc =(float) empleado / emplis;
		float resto = (float)empleado % emplis;
		float  promei = empleado + emplis / 2;
		
		
		
		
		
		
		String nombre = "";
		
		switch (nivel) {
		case 1 :
		nombre : System.out.println("resultado : " + oi );System.out.println("operacion: suma" );
		
		     break;
		case 2:
		nombre : System.out.println("resultado : " + ai );System.out.println("operacion: resta" );
			break;
		case 3:
	   nombre : System.out.println("resultado : " + is );System.out.println("operacion: producto" );
	   
			break;
		case 4:
	   nombre  : System.out.println("resultado : " + nc );System.out.println("operacion: division" );
			break;
	  case 5 : 
	   nombre : System.out.println("resultado : " + resto );System.out.println("operacion: resto" );
			break;
		case 6 :
	  nombre : System.out.println("resultado : " + promei );System.out.println("operacion: promedio" );
			break;
            }
	}

	}


