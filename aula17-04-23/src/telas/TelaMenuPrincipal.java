package telas;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

import controladores.ControladorMenuPrincipal;
public class TelaMenuPrincipal {

	

	

	
	

	public void criarTelaMenuPrincipal() {
		
		
		String menu1 = "1 * Coordenador";
		String menu2 = "2 * Atendente";
		String menu3 = "3 * Voltar ao Menu ";
		
		
		
		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(400,200);
		frameMenuPrincipal.setTitle("Menu Principal");
		
		
		JPanel panelMenuPrincipal = new JPanel();
		
		
		
		
		JLabel labelmenu1 = new JLabel(menu1);
		panelMenuPrincipal.add(labelmenu1);
		
		JLabel labelmenu2 = new JLabel(menu2);
		panelMenuPrincipal.add(labelmenu2);
		
		JLabel labelmenu3 = new JLabel(menu3);
		panelMenuPrincipal.add(labelmenu3);
		
		JTextField textReposta = new JTextField(10);
		panelMenuPrincipal.add(textReposta);
		
		JButton buttonEnviar = new JButton("Enviar");
		panelMenuPrincipal.add(buttonEnviar);
		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		
		ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textReposta, frameMenuPrincipal);
		buttonEnviar.addAncestorListener((AncestorListener) controladorMenuPrincipal);
		
		
		
	}

	public void TelaMenuPrincipal() {
		// TODO Auto-generated method stub
		
	}

	
		
		
	}

	
	

	

