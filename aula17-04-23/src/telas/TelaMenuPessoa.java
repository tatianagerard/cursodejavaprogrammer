package telas;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaMenuPessoa {
public TelaMenuPessoa(JFrame frameMenuPessoa, JFrame frameMenuPessoa2) {
		// TODO Auto-generated constructor stub
	}

public void criarTelaMenuCoordenador() {
		
		String menu1 = "1 Cadastrar Coordenador";
		String menu2 =  "2 Cadastrar Pessoa ";
		String menu3 =   "3 Voltar ao menu principal ";
		
		JFrame frameMenuPessoa = new JFrame();
		frameMenuPessoa.setSize(300,200);
		frameMenuPessoa.setTitle("Menu Pessoa");
		
		JPanel panelMenuPessoa = new JPanel();
		
		JLabel labelmenu1 = new JLabel(menu1);
		panelMenuPessoa.add(labelmenu1);
		
		JLabel labelmenu2 = new JLabel(menu2);
		panelMenuPessoa.add(labelmenu2);

		
		JLabel labelmenu3 = new JLabel(menu3);
		panelMenuPessoa.add(labelmenu3);
		
		JTextField textRepostaPessoa = new JTextField(15);
		panelMenuPessoa.add(frameMenuPessoa);
		
		JButton buttonClicar = new JButton("Clicar");
		panelMenuPessoa.add(buttonClicar);
		
		TelaMenuPessoa controladorMenuPessoa = new TelaMenuPessoa(frameMenuPessoa, frameMenuPessoa );
		buttonClicar.addActionListener((ActionListener) controladorMenuPessoa);
		
		frameMenuPessoa.add(panelMenuPessoa);
		frameMenuPessoa.setVisible(true);
		
  }
	
	
     }


