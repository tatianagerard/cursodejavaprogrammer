package manipulacaodearquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import entidades.Jogador;
import persistencia.LogDao;


        public class LogCrudJogador {
        	
      private static final String String = null;

	public void escreverNoArquivoLogJogador(Jogador jogador, String tipoOperacao) {
		
		LogDao logDao = new LogDao();
		LocalDateTime horaAtual = LocalDateTime.now();
		
		String enderecoArquivo = "C:\\RepositorioGithub\\meurepositoriov2\\cursodejavaprogrammer\\aula-03-05-23\\log.txt";
		String escrita;
		switch (tipoOperacao) {
		
		case  "Deletar":
			escrita = horaAtual + "O jogador(a) " + jogador.getNome() + " com Cpf: "+ jogador.getCpf() + "foi excluido!";
			break;
		case  "Alterar":
			escrita = horaAtual + " - O jogador(a) " + jogador.getNome() + " com Cpf: "+ jogador.getCpf() + " foi alterado!";
			break;
		case  "Cadastrar":
			escrita = horaAtual + " - O jogador(a) " + jogador.getNome() + " com Cpf: "+ jogador.getCpf() + " foi cadastrado!" ;
			break;
		}
		try {
			
			  BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));
			
			  buWriter.append(enderecoArquivo + "\n");
			  buWriter.close();
				
				System.out.println("Deu Bom");
				
				logDao.registrarLog(enderecoArquivo);
				
			}catch (IOException mensagemErro) {
				System.out.println("Deu Ruim:  " + mensagemErro);

			}


     }
}