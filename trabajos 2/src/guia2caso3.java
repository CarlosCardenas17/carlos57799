import java.util.Scanner;
public class guia2caso3 {

	public static void main(String[] args) {
		Scanner spc = new Scanner(System.in);
		//paso 1
		System.out.print("Ingrese número 1: ");
		int n1 = spc.nextInt();
		System.out.print("Ingrese número 2: ");
		int n2 = spc.nextInt();
		
		//Paso2
		
	     if(n1 == n2) {
	     System.out.println("Los numeros son iguales");
	     }
	      else {        //paso3
	     if(n1>n2) {
	     System.out.println("El primer número es mayor");
	    }
	     else{
	     System.out.println("El segundo número es mayor");
	    }
		
      
	}
	
    
 }
	
}


