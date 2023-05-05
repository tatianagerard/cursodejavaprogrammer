package telas;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuCoordenador;
import controladores.ControladorMenuPrincipal;

public class TelaMenuCoordenador {
	public TelaMenuCoordenador() {
		
	}

	public TelaMenuCoordenador(JTextField textRepostaMenuCoordenador, JFrame frameMenuCoordenador) {
		// TODO Auto-generated constructor stub
	}

	public void criarTelaMenuCoordenador() {
		
		String menu1 = "1 Cadastrar Coordenador";
		String menu2 =  "2 Cadastrar Pessoa ";
		String menu3 =   "3 Voltar ao menu principal ";
		
		JFrame frameMenuCoordenador = new JFrame();
		frameMenuCoordenador.setSize(300,200);
		frameMenuCoordenador.setTitle("Menu Coordenador");
		
		JPanel panelMenuCoordenador = new JPanel();
		
		JLabel labelmenu1 = new JLabel(menu1);
		panelMenuCoordenador.add(labelmenu1);
		
		JLabel labelmenu2 = new JLabel(menu2);
		panelMenuCoordenador.add(labelmenu2);

		
		JLabel labelmenu3 = new JLabel(menu3);
		panelMenuCoordenador.add(labelmenu3);
		
		JTextField textRepostaMenuCoordenador = new JTextField(15);
		panelMenuCoordenador.add(textRepostaMenuCoordenador);
		
		JButton buttonClicar = new JButton("Clicar");
		panelMenuCoordenador.add(buttonClicar);
		
		TelaMenuCoordenador controladorMenuCoordenador = new TelaMenuCoordenador(textRepostaMenuCoordenador, frameMenuCoordenador );
		buttonClicar.addActionListener((ActionListener) controladorMenuCoordenador);
		
		frameMenuCoordenador.add(panelMenuCoordenador);
		frameMenuCoordenador.setVisible(true);
		
  }
	
	
     }