
import java.util.Scanner;

public class caso2guia2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
        System.out.print("Ingrese numer: ");
        int n= sc.nextInt();
        
        String rpta ="Numero par";
        
        if(n % 2 == 0)
        	rpta = "Numero impar";
        System.out.println("Respuesta: " + rpta);

	}

}
