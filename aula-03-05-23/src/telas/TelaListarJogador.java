package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.ControladorTelaListarJogador;
import entidades.Jogador;
import java.util.List;

public class TelaListarJogador {
	public void listarJogador(List<Jogador> listaJogadores, JFrame menuPrincipal) {
		int quantidadeDeLinhas = listaJogadores.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][3];

		int posicaoColuna = 0;
		int posicaoLinha = 0;

		for (Jogador jogador : listaJogadores) {
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getCpf();

			posicaoColuna++;			

			tabelaString[posicaoLinha][posicaoColuna] = jogador.getNome();

			posicaoLinha++;
						
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getEmail();
			posicaoLinha++;
			posicaoColuna = 0;

		}

		String nomesColunas[] = { "CPF", "NOME","Email" };

		JFrame frameListarJogador = new JFrame();
		frameListarJogador.setSize(500, 600);

		JTable tabelaJogador = new JTable(tabelaString, nomesColunas);
		frameListarJogador.setSize(500, 600);

		tabelaJogador.setBounds(30, 40, 300, 300);

		JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaJogador);

		JPanel panelListarProgramador = new JPanel();

		panelListarProgramador.add(scrollPaneListarJogador);

		JButton voltarTelaListarJogador = new JButton("Voltar para o menu");
		panelListarProgramador.add(voltarTelaListarJogador);

		frameListarJogador.add(panelListarProgramador);
		frameListarJogador.setVisible(true);

		ControladorTelaListarJogador controladorTelaListarJogador = new ControladorTelaListarJogador(menuPrincipal,
				frameListarJogador);
		voltarTelaListarJogador.addActionListener(controladorTelaListarJogador);

	}

}
