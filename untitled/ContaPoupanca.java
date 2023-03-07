public class ContaPoupanca extends Conta{
    private Double rentabilidadeMensal = 0.01;

    public ContaPoupanca(String idConta) {
        super(idConta);
    }

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void calcularSaldo(){
        verificarSaldoNulo();
        System.out.println("Conta : " + ContaPoupanca.this.getIdConta() +
                "\nSaldo atual: R$" + this.getSaldoConta() +
                "\nRentabilidade de: R$" + (getRentabilidadeMensal() * getSaldoConta()) + "\n=====================================================");
    }
}
