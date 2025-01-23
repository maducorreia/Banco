public class Poupanca extends Conta {
        private double saldo;

    
    public Poupanca (String numero){
        super(numero);
    }

    public void renderJuros(double juros){
        double rendimento;
        rendimento = this.getSaldo() * juros;
        this.creditar(rendimento);
    }

    void creditar(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
