public class ContaInvestimento extends ContaBancaria {
    double ci;

    @Override
    public double calcularSaldo(){
        ci = this.getSaldo() + (0.05 * this.getSaldo());
        this.setSaldo(ci);
        return this.getSaldo();
    }
}
