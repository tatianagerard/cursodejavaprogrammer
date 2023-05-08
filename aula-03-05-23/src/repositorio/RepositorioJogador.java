package repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import entidades.Jogador;

public class RepositorioJogador  implements InterfaceJogador{
	
	List<Jogador> listaJogadores = new ArrayList<>();
	
	
	@Override
	 		// TODO Auto-generated method stub
	public  void salvarJogador(Jogador jogador) {
		listaJogadores.add(jogador);
		
	}


	@Override
	public List<Jogador> retornaListaJogadores() {
		// TODO Auto-generated method stub
		return listaJogadores;
	}


	@Override
	public Jogador buscarJogador(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Override
	public boolean deletarJogador(Jogador jogador) {
		boolean resultado;
		
		try {
			
			listaJogadores.remove(jogador);
			resultado = true;
		
		} catch (Exception e) {
			resultado = false;
		}
		
		return resultado;
	}

	@Override
	public Jogador buscarJogador1(String cpf) {
		
		for (Jogador jogadorVerificado:retornaListaJogadores()) {
			if(jogadorVerificado.getCpf().equals(cpf)) {
				
				return jogadorVerificado;
			}
			
		}
	
		return null;
	}

	
	}


	
	
	


