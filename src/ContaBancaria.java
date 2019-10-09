abstract class ContaBancaria {

    private double saldo = 0.0;

    public ContaBancaria(){
    }

    public double getSaldo() {
        //calcularSaldo();
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //depositar um valor na conta
    void depositar(double valor){
        this.saldo += valor;

    }

    //sacar um valor na conta
    boolean sacar(double valor){
        if (valor > this.saldo){
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }

    }

    //transferir um valor na conta
    void transferir(ContaBancaria destino, double valor){
        if (valor < this.saldo){
            System.out.println("Erro");
        }
        else{
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Sucesso");
        }
    }

    //saldo final
    public abstract double calcularSaldo();
}
