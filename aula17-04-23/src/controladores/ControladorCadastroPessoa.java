package controladores;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class ControladorCadastroPessoa extends ControladorCadastroCoordenador {

	public ControladorCadastroPessoa(JTextField textNomeRecebido, JTextField textCpfRecebido,
			JTextField textCoordenacaoRecebido, JFormattedTextField textRgRecebido, Object EnderecoRecebido) {
		super(textNomeRecebido, textCpfRecebido, textCoordenacaoRecebido, textRgRecebido, EnderecoRecebido);
		
	}

}
