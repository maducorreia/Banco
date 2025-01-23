package ExemploBanco;

import java.util.Arrays;

//import java.util.Arrays;

public class Banco {
    Conta contas[];
    int indice = 0;

    public Banco(int tamanho){
        contas = new Conta[tamanho];
    }

    public void adicionarConta(Conta conta){
        contas[indice] = conta;
        indice++;
    }


    

    @Override
    public String toString() {
        return "Contas: \n" + Arrays.toString(contas);
    }

    public String imprimirContas(){
        String resultado = "";
        for (Conta i : contas){
            resultado += i.getNumero();
        }
        return resultado;
    }
}
