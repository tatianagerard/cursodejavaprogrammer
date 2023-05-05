package controladores;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import entidades.Coordenador;
import entidades.Pessoa;
import gerenciadorArquivo.ManipulaArquivo;
import telas.TelaMenuCoordenador;

public class ControladorCadastroCoordenador implements ActionListener  {

	
	JTextField textNomeRecebido;
	JTextField textCpfRecebido;
	JTextField textCoordenacaoRecebido;
	JFormattedTextField textRgRecebido;
	
	ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
	
	
	
	public ControladorCadastroCoordenador(JTextField textNomeRecebido, JTextField textCpfRecebido,
			JTextField textCoordenacaoRecebido, JFormattedTextField textRgRecebido, Object EnderecoRecebido) {
		this.textNomeRecebido = textNomeRecebido;
		this.textCpfRecebido = textCpfRecebido;
		this.textRgRecebido = textRgRecebido;	
		this.textCoordenacaoRecebido = textCoordenacaoRecebido;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		manipulaArquivo.registrarCoordenador(popularCoordenador ());
		
	}
	
	public Coordenador popularCoordenador () {
		Object coordenador = new TelaMenuCoordenador() ;
		
		coordenador(textNomeRecebido.getText());
		((Pessoa) coordenador).setCpf(textCpfRecebido.getText());
		((Coordenador) coordenador).setCoordenacao(textCoordenacaoRecebido.getText());
		((Pessoa) coordenador).setRg(textRgRecebido.getText());
		
		
		return (Coordenador) coordenador;
}



	private void coordenador(String text) {
		// TODO Auto-generated method stub
		
	}



	
		
	}



	



	
		
	



	
	
