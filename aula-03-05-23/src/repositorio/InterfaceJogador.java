package repositorio;


import java.util.List;

import entidades.Jogador;

public interface InterfaceJogador {

	
	
	public void salvarJogador(Jogador jogador);
	public List<Jogador> retornaListaJogadores();
	
	public Jogador buscarJogador(String cpf);
	public Jogador buscarJogador1(String cpf);
	boolean deletarJogador(Jogador jogador);	
	public void alterarJogador(Jogador jogadorAtual, Jogador jogadorNovo );
	
}

