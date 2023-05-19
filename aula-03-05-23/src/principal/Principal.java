package principal;

import java.sql.Connection;

import javax.swing.JOptionPane;


 import telas.TelaMenuJogador;

public class Principal {

	public static void main(String[] args) {
		
       TelaMenuJogador telaMenuJogador = new TelaMenuJogador(); 
       
       telaMenuJogador.criarTelaMenuJogador();
       
	}
}
		
		//FabricaConexao fabricaConexao = new FabricaConexao();
		
		//Connection conexaoRecebida = fabricaConexao.criarConexao();
		
	   //  if(conexaoRecebida != null) {
	    //	 JOptionPane.showMessageDialog(null,"Deu bom a conexao");
	    
	    // }
	   //  if(conexaoRecebida == null) {
	    //	 JOptionPane.showMessageDialog(null,"Deu ruim a conexao");
	    // }
//	}

	
//	}


