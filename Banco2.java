import java.util.ArrayList;

public class Banco2 {
    ArrayList<Conta> contas; 

    public Banco2(){
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    
    }

     public void removerConta(Conta conta){
        contas.remove(conta);
    
    }

    @Override
    public String toString() {
        return "Contas: \n" + contas;
    }

}
