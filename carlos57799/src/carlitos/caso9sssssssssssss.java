package carlitos;
	

import java.util.Scanner;

public class caso9sssssssssssss
{

	public static void main(String[] args) {
		
		Scanner sac = new Scanner(System.in);
		
		int lado1 = 0;
		//lado1 area del rectangulo
		int lado2 = 0;
		//Lado2 Perimetro del rectangulo
		
		System.out.print("Ingrese lado1: ");
		lado1 = sac.nextInt();
		System.out.print("Ingrse lado2: ");
		lado2 = sac.nextInt();
		
		System.out.println("--------------------");
		System.out.println("Resultado");
		System.out.println("---------------------");
		System.out.println("Area del rectangulo: " + lado1 * lado1);
		System.out.println("Perimetro: " + lado2 * 4);

	}

}


