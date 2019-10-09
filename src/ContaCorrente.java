public class ContaCorrente extends ContaBancaria {
    double cc;

    @Override
    public double calcularSaldo(){
        cc = this.getSaldo() - (0.10 * this.getSaldo());
        this.setSaldo(cc);
        return this.getSaldo();
    }
}
