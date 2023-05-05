package telas;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroCoordenador {

		
	

public TelaCadastroCoordenador(JTextField textNomeCoordenador, JTextField textCpfCoordenador, JTextField textCoordenador) {
	// TODO Auto-generated constructor stub
}

public TelaCadastroCoordenador() {
	// TODO Auto-generated constructor stub
}

public static void criarTelaCadastroCoordenador() {
		
		String nomeCoordenador = "Digite o nome do Coordenador:";
		String cpf = "Digite o cpf do Coordenador:";
		String rg = "Digite o rg do Coordenador";
		String coordenacaoCoordenado = "Digite a gerencia do Coordenador:";
		
		
		JFrame frameCadastroCoordenador = new JFrame();
		frameCadastroCoordenador.setSize(400,200);
		
		JPanel panelCadastroCoordenador = new JPanel();
		
		
		JLabel labelNomeCoordenador = new JLabel(nomeCoordenador);
		panelCadastroCoordenador.add(labelNomeCoordenador);
		
		JTextField textNomeCoordenador = new JTextField(15);
		panelCadastroCoordenador.add(textNomeCoordenador);
		
		JLabel labelcpfCoordenador = new JLabel(cpf);
		panelCadastroCoordenador.add(labelcpfCoordenador);
		
		
		JTextField textCpfCoordenador = new JTextField(15);
		panelCadastroCoordenador.add(textCpfCoordenador);
		
		JLabel labelrgCoordernador = new JLabel(rg);
		panelCadastroCoordenador.add(labelrgCoordernador);
		
		JTextField textRgCoordenador = new JTextField(15);
		panelCadastroCoordenador.add(textRgCoordenador);
		
		JLabel labelCoordenador = new JLabel(coordenacaoCoordenado);
		panelCadastroCoordenador.add(labelCoordenador);
		
		JTextField textCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textCoordenador);
		
					
		JButton botaoEnviar = new JButton("Enviar");
		panelCadastroCoordenador.add(botaoEnviar);
		
		frameCadastroCoordenador.add(panelCadastroCoordenador);
		frameCadastroCoordenador.setVisible(true);
		
		TelaCadastroCoordenador cadastroCoordenador = new TelaCadastroCoordenador(textNomeCoordenador, textCpfCoordenador, textCoordenador);
		botaoEnviar.addActionListener((ActionListener) cadastroCoordenador);
}	
		
}
