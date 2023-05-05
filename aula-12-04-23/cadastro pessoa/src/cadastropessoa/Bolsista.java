
package cadastropessoa;
public class Bolsista  extends Aluno{
    private float bolsa;
    
    public void novaBolsa(){
        System.out.println("Nova bolsa para" + this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.print(this.nome + " é bolsista!! Aluno não pagante");
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    }
      
      
