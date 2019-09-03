package conversion;



import java.util.Scanner;


public class conversordecimal {
	
@SuppressWarnings("resource")
public static void main (String [] args) {
	
	
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Ingrese un numero decimal: ");
	    int input = scanner.nextInt();
	    int digito;
	    String binario = "";
	    do {
	    	
	    	digito = input % 2;
	    	binario += digito;
	    	input = input / 2;
	    } while (input != 0);
	    
	    
	    
	    binario = new StringBuilder(binario). reverse().toString();
	    
	    
	    System.out.println("Numero binario: " + binario);
	    
	}

}
