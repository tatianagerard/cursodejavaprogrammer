package telas;


import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TelaMenuPrincipal {

	public <ControladorMenu> void menuPrincipal() {
		
		String menu1 = " 1 recpecao";
		String menu2 = " 2 secretaria ";
		String menu3 = "3 cursos" ;
		
		
		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(400,300);
		frameMenuPrincipal.setTitle("Menu Principal");
		
		JPanel panelMenuPrincipal = new JPanel(); 
		
		
		
		JLabel labelmenu1 = new JLabel(menu1);
		panelMenuPrincipal.add(labelmenu1);
		
		JLabel labelmenu2 = new JLabel(menu2);
		panelMenuPrincipal.add(labelmenu2);
		
		JLabel labelmenu3 = new JLabel(menu3);
		panelMenuPrincipal.add(labelmenu3);
	
		JTextField textResposta = new JTextField(15);
		panelMenuPrincipal.add(textResposta);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelMenuPrincipal.add(botaoEnviar);
		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		
		ControladorTelaPrincipal controladorTelaPrincipal = new ControladorTelaPrincipal(textResposta,frameMenuPrincipal);
				botaoEnviar.addActionListener((ActionListener) controladorTelaPrincipal);
	}
	
	
}
