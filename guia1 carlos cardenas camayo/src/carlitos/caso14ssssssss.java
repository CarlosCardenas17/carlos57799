	package carlitos;
		import java.util.Scanner;

		public class caso14ssssssss {

			public static void main(String[] args) {
				Scanner lector = new Scanner(System.in);
				int numero, sumDig = 0;
				System.out.print("Ingrese un numero: ");
				numero = lector.nextInt();
				int aux=numero;
			
					sumDig = sumDig + (numero * 10);
					numero = numero / 10;
					
			    System.out.println("La suma de los digitos de " + aux + " es: " + sumDig);
				
			


	}

}
