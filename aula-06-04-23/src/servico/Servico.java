package servico;


	import javax.swing.JOptionPane;

	import entidade.Furadeira;
	import entidade.Makita;

	public class Servico {
		
			//CADASTRO DA FURADEIRA 
			public Furadeira cadastroFuradeira (Furadeira furadeiraParamentro) {
				
				furadeiraParamentro.setCodigo(JOptionPane.showInputDialog("Digite o codigo da Furadeira: "));
				furadeiraParamentro.setMarca(JOptionPane.showInputDialog("Digite a marca da Furadeira: "));
				furadeiraParamentro.setPrecoDeCompra(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço de compra da furadeira")));
				furadeiraParamentro.setPrecoDeVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço de venda da furadeira")));
				
				
				return furadeiraParamentro;
			}
		
			//EXIBE FURADEIRA 
			public Furadeira exibeFuradeira (Furadeira furadeiraParametro) {
				
				//CALCULAR O LUCRO: VENa 
				CalcularLucro calcularLucro = new CalcularLucro();
				double lucro = ((CalcularLucro) calcularLucro).calcularLucro(furadeiraParametro.getPrecoDeCompra(), furadeiraParametro.getPrecoDeVenda());		
				
				//EXIBE MENSAGEM 
				JOptionPane.showMessageDialog(null, "Código da furadeira : " + furadeiraParametro.getCodigo());
				JOptionPane.showMessageDialog(null, "Marca da furadeira : " + furadeiraParametro.getMarca());
				JOptionPane.showMessageDialog(null, "Preço da compra da furadeira : " + furadeiraParametro.getPrecoDeCompra());
				JOptionPane.showMessageDialog(null, "Preço da venda da furadeira : " + furadeiraParametro.getPrecoDeVenda());
				JOptionPane.showMessageDialog(null, "O lucro é da furadeira foi de : " + lucro);
				
				return furadeiraParametro;
			}
			
			
			// CADASTRO
			public Makita cadastraMakita (Makita makitaParametro) {
				
				makitaParametro.setCodigo(JOptionPane.showInputDialog("Digite o codigo da Makita :"));
				makitaParametro.setMarca(JOptionPane.showInputDialog("Digite a marca da Makita : "));
				makitaParametro.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra da Makita : ")));
				makitaParametro.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda da Makita : ")));
				
				return makitaParametro;	
			}
			
			//CADASTRO DA MAKITA 
			public Makita exibeMakita (Makita makitaParametro) {
				
				JOptionPane.showMessageDialog(null, "O código da Makita é : " + makitaParametro.getCodigo());
				JOptionPane.showMessageDialog(null, "Marca da Makita : " + makitaParametro.getMarca());
				JOptionPane.showMessageDialog(null, "Preço da compra da Makita : " + makitaParametro.getPrecoDeCompra());
				JOptionPane.showMessageDialog(null, "Preço da venda da Makita : " + makitaParametro.getPrecoDeVenda());
				
				//CALCULAR LUCRO 
				CalcularLucro lucroCalculado = new CalcularLucro();
				double lucro = lucroCalculado.calcularLucro(makitaParametro.getPrecoDeCompra(), makitaParametro.getPrecoDeVenda());
				//EXIBE O LUCRO 
				JOptionPane.showMessageDialog(null, "O lucro da Makita foi de : " + lucro);
				
				return makitaParametro;
				
			}

}
