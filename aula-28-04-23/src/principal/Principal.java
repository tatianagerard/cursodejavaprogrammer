package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entidades.Pessoa;


public class Principal {
	
	

	public static <TelaMenuPrincipal> void main(String[]args) {
		

		
		
      Pessoa pessoa = new Pessoa ();		
		List<Pessoa>listaPessoa = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		String resposta = null;
		Boolean resultado = true;
		
		do {
			
			System.out.println("1 para cadastrar = 2 para sair");
			resposta = entrada.nextLine();
			
			switch (resposta) {
			case "1":
				
				
				System.out.println("Digite o jogador");
				pessoa.setJogador(entrada.nextLine());
				
				System.out.println("Digite o nome: ");
				pessoa.setNome(entrada.nextLine());
				
				System.out.println("Digite o cpf: ");
				pessoa.setCpf(entrada.nextLine());
				
				System.out.println("Digite idade");
				pessoa.setIdade(entrada.nextLine());
				
				System.out.println("Digite salario");
				pessoa.setSalario(entrada.nextLine());
				
				
				listaPessoa.add(pessoa);
				break;
				 
			case "2":
				resultado = false;
				break;
			}
	} while(resultado) ;
	
	for (Pessoa pessoaItem:listaPessoa) {
		 System.out.println(pessoaItem.getJogador());
		System.out.println(pessoaItem.getNome());
		System.out.println(pessoaItem.getCpf());
		System.out.println(pessoaItem.getIdade());
		System.out.println(pessoaItem.getSalario());
		
	
	
	   }
	}		
		
}


	

		


