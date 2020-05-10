
		package carlitos;

		import java.util.Scanner;


		public class caso4ss
		{
		   public static void main(String[] args) 
		   {
				Scanner sec = new Scanner(System.in);
				
				float num1 = 0, num2 = 0;
				
				System.out.println("Ingrese primer número:");
				num1 = sec.nextFloat();
				
				System.out.println("Ingrese segundo número:");
				num2 = sec.nextFloat();
				
				float suma,resta,producto,división,resto;
				suma = num1 + num2;
				resta = num1 - num2;
				producto = num1 * num2;
				división = num1 / num2;
				resto = num1 % num2;
			
				
				System.out.println("------------------");
			    System.out.println("Resultados");
			    System.out.println("------------------");
			    System.out.println("Suma: " + (num1 + num2));
			    System.out.println("Resta: " + (num1 - num2));
			    System.out.println("producto: " + (num1 * num2));
			    System.out.println("división: " + (num1 / num2));
			    System.out.println("resto: " + (num1 % num2));
			    
			    
			    
		    
			    
		  }

			
	}

		
