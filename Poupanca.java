package ExemploBanco;

public class Poupanca extends Conta {
    
    public Poupanca (String numero){
        super(numero);
    }

    public void renderJuros(double juros){
        double rendimento;
        rendimento = this.getSaldo() * juros;
        this.creditar(rendimento);
    }

}
