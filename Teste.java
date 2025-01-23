package ExemploBanco;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta("111");
        conta.creditar(100);

        ContaEspecial ce = new ContaEspecial("333", 500);
        ce.creditar(1000);

        conta.transferir(500, ce);

        System.out.println(conta);
        System.out.println("-------");
        System.out.println(ce);


        
        

        /*
        Banco banco = new Banco(2);
        banco.adicionarConta(conta);
        banco.adicionarConta(conta2);
        System.out.println(banco);
*/
/*
        Banco2 banco2 = new Banco2();
        banco2.adicionarConta(conta);
        banco2.adicionarConta(conta2);
        System.out.println(banco2);
*/


       /*  Conta contas[] = new Conta [3];

        for (int i=0; i<3; i++){
            String numero = i + "";
            double saldo = (i+1) * 111;
            contas[i] = new Conta(numero,saldo);
        }
            

        for (Conta i : contas){
            System.out.println(i.numero);
        }
            */

    }
}
