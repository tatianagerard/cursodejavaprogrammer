package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class FabricaConexao {
	
	private static String USUARIO = "tati" ;// senha usuario
	private static String SENHA  = "tati@2023" ; // senha usuario
	
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/db_cadastro_jogador?usTimezone=true&serverTimezone=UTC";//url do banco
	
	public  Connection criarConexao() {
		Connection conexao;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//drive que vai ser usado
			conexao = DriverManager.getConnection(BANCO_URL,USUARIO,SENHA);//Cria a conexao pois vai pegar todas as informaçoes
			System.out.println("Deu certo a conexao!");
					
       	}catch (Exception mensagemErro) {//Aquele e dentro posso colocar qualqer variavel entro dele
		    conexao = null;		
     		System.out.println("Problema ao conectar!");
		    System.out.println("##########################");
		    System.out.println(mensagemErro);
		    System.out.println(mensagemErro);//Apresentar o erro no console.
		
	}
		return conexao;
		
	
	
 }
}
