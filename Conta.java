package ExemploBanco;
public class Conta{
    private String numero;
    private double saldo;


    public Conta (String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(String numero){
        this.numero = numero;
        this.saldo = 0;
    }

    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    void creditar(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString(){
        return "numero: " + this.numero + 
        "\nsaldo: " + this.saldo;
    }

    public void transferir (double valor, Conta destino){
        if (this.debitar(valor))
            destino.creditar(valor);
    }


    public boolean equals(Object o){
        if (o instanceof Conta){
            Conta novaConta = (Conta)o;
            if (this.numero.equals(novaConta.numero) && this.saldo==novaConta.saldo){
                return true;
            }
        }
        return false;        
    }

    void debitar2 (double valor){
        this.saldo -= valor;
    }
    
    public boolean debitar (double valor){
        if (this.saldo>=valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getNumero() {
        return numero;
    }


}