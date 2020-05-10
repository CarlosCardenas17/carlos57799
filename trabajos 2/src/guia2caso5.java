
import java.util.Scanner;

public class guia2caso5 {

	public static void main(String[] args) 
	{
		Scanner slc = new Scanner(System.in);
		//paso1
		System.out.print("Ingrese cantidad: ");
		int cantidad = slc.nextInt();
		//pàso2
		System.out.print("Ingrese el precio: ");
		float precio = slc.nextFloat();
		//paso3
		float total = cantidad * precio;
		float dscto = 0;
		
		if(cantidad > 8)
		dscto = (float)0.1 * total;
		
		System.out.println("<<< RESULTADOS >>>");
		System.out.println("total,,,,,,,,,,,:" + total);
		System.out.println("Descuento,,,,,,:" + dscto);
		System.out.println("Neto,,,,,,,,,,:" + (total - dscto));
		}

}
