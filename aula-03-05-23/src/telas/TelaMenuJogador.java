package telas;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;


import controlador.ControladorTelaMenuJogador;



public class TelaMenuJogador {
	

	public void  criarTelaMenuJogador() {
		
		 String menu1 = "Digite 1 = para cadastrar";
		 String menu2 = "Digite 2 = para listar";
		 String menu3 = "Digite 3 = para deletar";
		 String menu4 = "Digite 4 = para Atualizar";
		 
		 
		 JFrame frameTelaMenuJogador = new JFrame();
		 frameTelaMenuJogador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frameTelaMenuJogador.setSize(400,250);		 
		 JPanel panelTelaMenuJogador = new JPanel();
		 
		 
		 GridLayout grid = new GridLayout(0,1);
		 panelTelaMenuJogador.setLayout(grid);
		 
		 
		 JLabel labelmenu1 = new JLabel(menu1);
		 panelTelaMenuJogador.add(labelmenu1);
		 
		 JLabel labelmenu2 = new JLabel(menu2);
		 panelTelaMenuJogador.add(labelmenu2);
		 
		 JLabel labelmenu3 = new JLabel(menu3);
			panelTelaMenuJogador.add(labelmenu3);
		 
			 JLabel labelmenu4 = new JLabel(menu4);
				panelTelaMenuJogador.add(labelmenu4);
		 
		 JTextField textRespostaTelaMenuJogador = new JTextField(15);
		 panelTelaMenuJogador.add(textRespostaTelaMenuJogador);
		 
		 JButton buttonEnviarTelaMenuJogador = new JButton("Enviar");
			panelTelaMenuJogador.add(buttonEnviarTelaMenuJogador);
		 
		 frameTelaMenuJogador.add(panelTelaMenuJogador);
		 frameTelaMenuJogador.setVisible(true);
		 
		 ControladorTelaMenuJogador controladorTelaMenuJogador = new ControladorTelaMenuJogador(frameTelaMenuJogador,textRespostaTelaMenuJogador);
         buttonEnviarTelaMenuJogador.addActionListener(controladorTelaMenuJogador);
	}

}
