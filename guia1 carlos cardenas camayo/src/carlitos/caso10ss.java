package carlitos;


import java.util.Scanner;

public class caso10ss
{

	public static void main(String[] args) {
		
		Scanner sac = new Scanner(System.in);
		
		int lado1 = 0;
		//lado1 area del triangulo
		int lado2 = 0;
		//Lado2 Perimetro del tringulo
		
		System.out.print("Ingrese lado1: ");
		lado1 = sac.nextInt();
		System.out.print("Ingrse lado2: ");
		lado2 = sac.nextInt();
		
		System.out.println("--------------------");
		System.out.println("Resultado");
		System.out.println("---------------------");
		System.out.println("Area del triangulo: " + lado1 * lado1);
		System.out.println("Perimetro del triangulo: " + lado2 * 3);

	}

}


