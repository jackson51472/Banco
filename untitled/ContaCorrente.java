public class ContaCorrente extends Conta {
    private Double limiteConta;

    public ContaCorrente(String idConta, Double limiteConta) {
        super(idConta);
        this.setLimiteConta(limiteConta);
    }

    public void setLimiteConta(Double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public void calcularSaldo(){
        verificarSaldoNulo();
        System.out.println("Conta : " + ContaCorrente.this.getIdConta() +
                "\nSaldo atual: R$" + this.getSaldoConta() +
                "\nLimite: R$" + limiteConta + "\n=====================================================");
    }
}
