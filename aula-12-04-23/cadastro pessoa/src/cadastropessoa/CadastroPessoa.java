
package cadastropessoa;
public class CadastroPessoa {
   
    public static void main(String[] args) {
       
        Convidado c1 = new Convidado();
        c1.setNome("Ana");
        c1.setIdade(29);
        c1.setSexo("F");
        c1.setCPF("529.588.548.85");
        
        
        Convidado c2 = new Convidado();
        c2.setNome("Gomes");
        c2.setIdade(39);
        c2.setSexo("V");
        c2.setCPF("874.525.894.23");
        System.out.println(c2.toString());
              
        
       Aluno a1 = new Aluno();
       a1.setNome("Higor");
       a1.setMatricula(47);
       a1.setCurso("Phyton");
       a1.setIdade(29);
       a1. setSexo("v");
       a1.pagarMensalidade();
       
       Bolsista a2 = new Bolsista();
       a2.setMatricula(58);
       a2.setNome("Mara");
       a2.setBolsa(1.5f);
       a2.setSexo("F");
       a2.pagarMensalidade();
       
       
       
                
                
   
        }
    }
    

