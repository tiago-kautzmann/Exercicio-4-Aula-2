public class ContaCorrente {

    private double saldo;
    private double limite;

    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor <= this.saldo + this.limite) {
            this.saldo -= valor;
        }
    }

}
