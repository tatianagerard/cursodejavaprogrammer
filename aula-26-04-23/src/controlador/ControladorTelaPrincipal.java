package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class ControladorTelaPrincipal<TelaMenuPrincipal> implements ActionListener {

	
		
		
		JTextField textRespostaRecebida;
		JFrame frameMenuPrincipalRecebido;
		@Override
		public void actionPerformed(ActionEvent e) {				
			
		
		
		switch (textRespostaRecebida.getText()) {
		case "1":
			JOptionPane.showMessageDialog(null , " Se a escolha for 1");
			break;
		case "2":
			JOptionPane.showMessageDialog(null , " Se a escolha for 2");
		break;
		case"3":
			JOptionPane.showMessageDialog(null , " Se a escolha for 3");
			break;
		
		}
		
	}
}







