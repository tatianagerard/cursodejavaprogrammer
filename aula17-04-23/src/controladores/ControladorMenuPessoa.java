package controladores;


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JFrame;
	import javax.swing.JTextField;

	import telas.TelaCadastroCoordenador;
	import telas.TelaMenuCoordenador;

	public class ControladorMenuPessoa implements ActionListener {
		
		JTextField textRespostaRecebida;
		JFrame frameMenuRecebido;
		
		
		TelaCadastroCoordenador telaCadastroCoordenador = new TelaCadastroCoordenador();
		
		public ControladorMenuPessoa(JTextField textRespostaRecebida, JFrame frameMenuCoordenador) {
			
			this.textRespostaRecebida = textRespostaRecebida;
			this.frameMenuRecebido = frameMenuCoordenador;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String resposta = textRespostaRecebida.getText();
			
			if (resposta.equals("1") || resposta.equals("2") ) {
				
				switch (resposta) {
				case "1":
					telaCadastroCoordenador.criarTelaCadastroCoordenador();
					frameMenuRecebido.setVisible(false);
					break;
				case "2":
					System.out.println("Voltar");
					break;
				}
			}else {
			
				System.out.println("Invalido");
			
			}
			
		}


}
