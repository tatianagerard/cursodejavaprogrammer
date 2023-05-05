package telas;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroPessoa {

public TelaCadastroPessoa(JTextField textRgCoordenador, JTextField textCpfPessoa, String pessoa) {
		// TODO Auto-generated constructor stub
	}

public static void criarTelaCadastroCoordenador() {
		
		String nomePessoa = "Digite o nome do Pessoa:";
		String cpf = "Digite o cpf do Pessoa:";
		String rg = "Digite o rg do Pessoa";
		String Pessoa = "Digite a gerencia do Pessoa:";
		
		
		JFrame frameCadastroPessoa = new JFrame();
		frameCadastroPessoa.setSize(400,200);
		
		JPanel panelCadastroPessoa = new JPanel();
		
		
		JLabel labelNomePessoa = new JLabel(nomePessoa);
		panelCadastroPessoa.add(labelNomePessoa);
		
		JTextField textNomePessoa = new JTextField(15);
		panelCadastroPessoa.add(textNomePessoa);
		
		JLabel labelcpfPessoa = new JLabel(cpf);
		panelCadastroPessoa.add(labelcpfPessoa);
		
		
		JTextField textCpfPessoa = new JTextField(15);
		panelCadastroPessoa.add(textCpfPessoa);
		
		JLabel labelrgPessoa= new JLabel(rg);
		panelCadastroPessoa.add(labelrgPessoa);
		
		JTextField textRgCoordenador = new JTextField(15);
		panelCadastroPessoa.add(textRgCoordenador);
		
		JLabel labelCoordenador = new JLabel(nomePessoa);
		panelCadastroPessoa.add(labelCoordenador);
		
		JTextField textCoordenador = new JTextField(10);
		panelCadastroPessoa.add(textCoordenador);
		
					
		JButton botaoEnviar = new JButton("Enviar");
		panelCadastroPessoa.add(botaoEnviar);
		
		frameCadastroPessoa.add(panelCadastroPessoa);
		frameCadastroPessoa.setVisible(true);
		
		TelaCadastroPessoa cadastroCoordenador = new TelaCadastroPessoa(textRgCoordenador, textCpfPessoa, Pessoa);
		botaoEnviar.addActionListener((ActionListener) frameCadastroPessoa);
}	
		
}


