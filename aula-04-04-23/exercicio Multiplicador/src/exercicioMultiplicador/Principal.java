package exercicioMultiplicador;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1;
		double numero2;
	   double resultado;
		
		String numeroUmString;
		String numeroDoisString;
		
		//Objetos De Entrada De Dados
		Scanner entradaDados = new Scanner(System.in);
		
		//Inserção de Dados pelo Usuario
		
		System.out.println("Digite o primeiro numero:");
		
		numeroUmString = entradaDados.next();
		
		numero1 = Integer.parseInt(numeroUmString);
		
		System.out.println("O numero um double é: " + numero1);
		System.out.println("Digite o segundo numero: ");
		
		
		numeroDoisString = entradaDados.next();
		
		numero2 = Integer.parseInt(numeroDoisString);
		
		
		resultado=(numero1 * numero2);
		
		System.out.println("O resultado entre os numeros é "  + resultado);
		
		
		
	
		
			
		}
	}


