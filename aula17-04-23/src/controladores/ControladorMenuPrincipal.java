package controladores;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.TelaMenuCoordenador;

public class ControladorMenuPrincipal {
	JTextField textRespostaRecebida;
	JFrame frameMenuPrincipalRecebido;
	
	
	//Objetos inicializados
	
	TelaMenuCoordenador telaMenuCoordenador = new TelaMenuCoordenador();
	
	
	public ControladorMenuPrincipal(JTextField textRespostaParametro, JFrame frameMenuPrincipal) {
		this.textRespostaRecebida = textRespostaParametro;
		this.frameMenuPrincipalRecebido = frameMenuPrincipal;
	}


	public void actionPerformed(ActionEvent e) {
		String resposta = textRespostaRecebida.getText();
		
		if (resposta.equals("1") || resposta.equals("2") || resposta.equals("3") ) {
			
			switch (resposta) {
				case "1":
					telaMenuCoordenador.criarTelaMenuCoordenador();
					frameMenuPrincipalRecebido.setVisible(false);
					
				break;
				
				case "2":
					System.out.println("Menu Atendente");
				break;
				
				case "3":
					System.out.println("Menu Principal");
				
			}
		
		}else {
			JOptionPane.showMessageDialog(null, "Opção Invalida!!!");
		}
	}
}
		


