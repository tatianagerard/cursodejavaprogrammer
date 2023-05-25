package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;

public class ControladorFormularioAlterarJogador implements ActionListener {



        JFrame frameMenuInicial;
        JFrame frameFormularioAlterar;
        
          JTextField textNomeRecebido;
          JTextField textCpfRecebido;
          JTextField textEmailRecebido;
          
          
          
       RepositorioJogador repositorioJogadorRecebido;
         Jogador jogadorAtual;





     public ControladorFormularioAlterarJogador(JFrame frameMenuInicial, JFrame frameFormularioAlterar,
		JTextField textNomeRecebido, JTextField textCpfRecebido, RepositorioJogador repositorioJogadorRecebido,
		Jogador jogadorAtual, JTextField textEmail) {
	 this.frameMenuInicial = frameMenuInicial;
	 this.frameFormularioAlterar = frameFormularioAlterar;
	 this.textNomeRecebido = textNomeRecebido;
	 this.textCpfRecebido = textCpfRecebido;
	 this.repositorioJogadorRecebido = repositorioJogadorRecebido;
	 this.jogadorAtual = jogadorAtual;
    this.textEmailRecebido = textEmail; 

     }



public ControladorFormularioAlterarJogador(JFrame frameMenuPrincipal, JFrame frameFormularioAlterarJogador,
			JTextField textNome, JTextField textCpf, RepositorioJogador repositorioJogadorRecebido2,
			Jogador jogadorEncontrado) {
		// TODO Auto-generated constructor stub
	}



@Override
           public void actionPerformed(ActionEvent e) {
	
	repositorioJogadorRecebido.alterarJogador(jogadorAtual, popularJogadorNovo());
	
	frameMenuInicial.setVisible(true);
	
	frameFormularioAlterar.setVisible(false);
}

   public Jogador popularJogadorNovo() {
	Jogador jogadorNovo = new Jogador();
	
	jogadorNovo.setNome(textNomeRecebido.getText());
	jogadorNovo.setCpf(textCpfRecebido.getText());
	jogadorNovo.setEmail(textEmailRecebido.getText());
	
	
	return jogadorNovo;
	
	
          }


}
