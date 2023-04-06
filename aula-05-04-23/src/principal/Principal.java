package principal;

import java.util.Scanner;

import entidade.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Rodou");
       
       Pessoa pessoa =  new Pessoa();
        Scanner entradaDados = new Scanner(System.in);
        
         String recebeNome;
        System.out.println("Qual é o seu nome:");
        
        recebeNome = entradaDados.next();
        pessoa.setNome(recebeNome);
        System.out.println(pessoa.getNome());
        
	    String recebeCPF;
	    System.out.println("Qual é o seu CPF:");
        
	 recebeCPF = entradaDados.next();
    pessoa.setCpf(recebeCPF);
    System.out.println(pessoa.getCpf());
	
	}
}
