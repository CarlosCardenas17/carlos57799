
		package carlitos;

		import java.util.Scanner;


		public class caso4ss
		{
		   public static void main(String[] args) 
		   {
				Scanner sec = new Scanner(System.in);
				
				float num1 = 0, num2 = 0;
				
				System.out.println("Ingrese primer n�mero:");
				num1 = sec.nextFloat();
				
				System.out.println("Ingrese segundo n�mero:");
				num2 = sec.nextFloat();
				
				float suma,resta,producto,divisi�n,resto;
				suma = num1 + num2;
				resta = num1 - num2;
				producto = num1 * num2;
				divisi�n = num1 / num2;
				resto = num1 % num2;
			
				
				System.out.println("------------------");
			    System.out.println("Resultados");
			    System.out.println("------------------");
			    System.out.println("Suma: " + (num1 + num2));
			    System.out.println("Resta: " + (num1 - num2));
			    System.out.println("producto: " + (num1 * num2));
			    System.out.println("divisi�n: " + (num1 / num2));
			    System.out.println("resto: " + (num1 % num2));
			    
			    
			    
		    
			    
		  }

			
	}

		
