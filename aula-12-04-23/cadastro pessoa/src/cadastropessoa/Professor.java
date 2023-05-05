
package cadastropessoa;
public class Professor  extends Aluno{
    
    private  int especialidade;
     private int salario;
     public void receberAumento(){
    System.out.print("O professor vai rceber um aumento de 20% sobre o salario" );
    
     }

    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
