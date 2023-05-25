package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Jogador;
import manipulacaodearquivo.LogCrudJogador;

//Acessar a tabela do objeto jogador
public class JogadorDao {
	
	LogCrudJogador logCrudJogador = new LogCrudJogador();
	
	public boolean salvarJogadorBanco(Jogador jogador) { 
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		boolean salvamento = false;
		String comandoSqlInsert = "Insert into tabela_jogador(cpf,nome)values(?,?)";
		
		Connection conexaoRecebida = null;
		PreparedStatement declaracaoComando = null;
		
		try {
			conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = conexaoRecebida.prepareStatement(comandoSqlInsert);//recebe o banco e comando Sql
			declaracaoComando.setString(1, jogador.getCpf());
			declaracaoComando.setString(2,jogador.getNome().toUpperCase());
			declaracaoComando.setString(3, jogador.getEmail().toUpperCase());
			
			declaracaoComando.execute();
			
			
			salvamento = true;
			
			
            System.out.println("Jogador Registrado com sucesso");
			
			logCrudJogador.escreverNoArquivoLogJogador(jogador, "Cadastrar");
			
		}catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao salvar");
			 salvamento = false;
			 
		}finally {//Executa depois do try sempre
			
		}
		try {//fecha a conexao
			if(conexaoRecebida  !=  null) {// Verificando e a conexoa é nula.
				conexaoRecebida.close();
			}
			
			if(declaracaoComando != null);
			declaracaoComando.close();
		
		} catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao tentar fechar a conecao");
			
		}
		
		return salvamento;
	}
		
	public boolean deletarJogadorPelocpf(String cpf) {
		
       FabricaConexao fabricaConexao = new FabricaConexao();
		
		boolean exclusao = false;
		
		String comandosqlDeletar =" delete  from tabela_jogdor where cpf ?;";
		
		Connection conexaoRecebida = null;
		PreparedStatement declaracaoComando = null;
		
		try {
			 conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = conexaoRecebida.prepareStatement(comandosqlDeletar);//recebe o banco e comando Sql
			declaracaoComando.setString(1,cpf);
			
			declaracaoComando.execute();
			
			exclusao = true;
			System.out.println("Jogador Deletado com sucesso");
			
		}catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao Deletar");
			 exclusao = false;
			 
		}finally {//Executa depois do try sempre
			
		}
		try {//fecha a conexao
			if(conexaoRecebida  !=  null) {// Verificando e a conexoa é nula.
				conexaoRecebida.close();
			}
			
			if(declaracaoComando != null);
			declaracaoComando.close();
		
		} catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao tentar fechar a conecao");
			
		}
		
		
		
		return exclusao;
		
	}

	public List<Jogador> buscarListaDeJogador(){
		
		String comandoSqlBuscar = "select * from tabela_jogador";
		//List<Jogador> listaJogadoresDoBanco = new ArrayList<>();
		
		
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		Connection conexaoRecebida = null;
		PreparedStatement declaracaoComando = null;
		List<Jogador>listaJogadoresDoBanco = new ArrayList<>();
		
		
		ResultSet resultadoTabela = null;
		
		try {
			conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlBuscar);//recebe o banco e comando Sql
			
			resultadoTabela = declaracaoComando.executeQuery();
			
			while (resultadoTabela.next()) {
				Jogador jogador = new Jogador();
				
				jogador.setNome(resultadoTabela.getString("nome"));
				jogador.setCpf(resultadoTabela.getString("cpf"));
				jogador.setEmail(resultadoTabela.getString("email"));
				
				
				listaJogadoresDoBanco.add(jogador);
			}
				
						
		}catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao Buscar");
			
			 
		}finally {//Executa depois do try sempre
			
		}
		try {//fecha a conexao
			if(conexaoRecebida  !=  null) {// Verificando e a conexoa é nula.
				conexaoRecebida.close();
			}
			
			if(declaracaoComando != null);
			declaracaoComando.close();
		
		} catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao tentar fechar a conecao");
			
	    	}
		
	
		
	   
		

		
		
		return listaJogadoresDoBanco;
		
	}
	
      public boolean alterarJogador(Jogador jogador) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();  
		
		
	     boolean alteracao = false;
	     String comandoSqlUpdate = "update  tabela_jogador set cpf = ?, nome = ?, email = ? where  cpf = ?" ;
	     
	     
	     Connection conexaoRecebida = null;
	     PreparedStatement declaracaoComando = null;
	     
	     try {
				conexaoRecebida = fabricaConexao.criarConexao();
				
				declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlUpdate);
				
				declaracaoComando.setString(1, jogador.getCpf());
				declaracaoComando.setString(2, jogador.getNome());
				declaracaoComando.setString(3, jogador.getEmail());
				
				declaracaoComando.setString(4, jogador.getCpf());
				
				declaracaoComando.execute();
				
				alteracao = true;
				System.out.println("Jogador Alterado com sucesso");
				
				logCrudJogador.escreverNoArquivoLogJogador(jogador, "Alterar");
	     } catch (Exception mensagemErro) {
				System.out.println(mensagemErro);
				System.out.println("Erro ao alterar!");
				alteracao = false;
				
	     }finally { 
	    	 
	    	 try {
	    		 if(conexaoRecebida != null)
	    			 conexaoRecebida.close();
				
				
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception msgErro) {
				System.out.println(msgErro);
				System.out.println("Erro ao tentar fechar a conexao");
			}
			
		}
		
		return alteracao;

	}
	
}

	     
	     
	     
