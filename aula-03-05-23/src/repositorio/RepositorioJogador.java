package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Jogador;
import persistencia.JogadorDao;

public class RepositorioJogador  implements InterfaceJogador{
	
	List<Jogador> listaJogadores = new ArrayList<>();
	
	JogadorDao jogadorDao = new JogadorDao();
	
	
	@Override
	 		// TODO Auto-generated method stub
	public  void salvarJogador(Jogador jogador) {
		//listaJogadores.add(jogador);
		jogadorDao.salvarJogadorBanco(jogador);
		
	}


	@Override
	public List<Jogador> retornaListaJogadores() {
		// TODO Auto-generated method stub
		return jogadorDao.buscarListaDeJogador();
	//	return listaJogadores;
		
	}


	@Override
	public Jogador buscarJogador(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Override
	public boolean deletarJogador(Jogador jogador) {
		boolean resultado;
		resultado = jogadorDao.deletarJogadorPelocpf(jogador.getCpf());
		/*
		try {
			
			listaJogadores.remove(jogador);
			resultado = true;
		
		} catch (Exception e) {
			resultado = false;
		}
		*/
		return resultado;
	}
//Buscar de acordo  com o cpf,caso nao encontre volta null.
	@Override
	public Jogador buscarJogador1(String cpf) {
		
		for (Jogador jogadorVerificado:retornaListaJogadores()) {
			if(jogadorVerificado.getCpf().equals(cpf)) {
				
				return jogadorVerificado;
			}
			
		}
	
		return null;
	}
	    
	@Override
	public void alterarJogador(Jogador jogadorAtual, Jogador jogadorNovo) {
		
		listaJogadores.remove(jogadorAtual);
		listaJogadores.add(jogadorNovo);

	
	}
}

	
	
	


