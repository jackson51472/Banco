import java.util.ArrayList;

public abstract class Conta {

    private String idConta;
    private Double saldoConta;
    private Integer maxCliente = 1;
    private final Cliente cliente[] = new Cliente[maxCliente];
    private Integer quantidadeCliente = 0;
    private ArrayList<Debito> listaDebito = new ArrayList<>();
    private ArrayList<Credito> listaCredito = new ArrayList<>();

    public Conta(String idConta){
        this.setIdConta(idConta);
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public ArrayList<Debito> getListaDebito() {
        return listaDebito;
    }

    public void setListaDebito(ArrayList<Debito> listaDebito) {
        this.listaDebito = listaDebito;
    }

    public ArrayList<Credito> getListaCredito() {
        return listaCredito;
    }

    public void setListaCredito(ArrayList<Credito> listaCredito) {
        this.listaCredito = listaCredito;
    }

    public void verificarSaldoNulo(){
        if (getSaldoConta() == null){
            this.setSaldoConta(0.);
        }
    }

    public void depositar(Double valorDepositado){
        verificarSaldoNulo();
        Credito credito = new Credito(valorDepositado);
        this.listaCredito.add(credito);

        this.setSaldoConta(getSaldoConta() + valorDepositado);
    }

    public void sacar(Double valorSacado){
    verificarSaldoNulo();
        if (valorSacado > getSaldoConta()){
            System.out.println("Sem saldo para sacar: \n_____________________________________________________");
        }else {
            Debito d1 = new Debito(valorSacado);
            this.setSaldoConta(getSaldoConta() - valorSacado);
            System.out.println("Efetuando saque \nzuzuzuzuzuzuuzuzuz \nPronto saque efetuado com sucesso \n_____________________________________________________");
        }
    }

    public  Boolean adicionarCliente(Cliente cliente){

        if (this.quantidadeCliente < this.maxCliente){
            this.cliente[quantidadeCliente] = cliente;
            quantidadeCliente ++;
            return true;

        }else return false;
    }

    public void transferir(Conta recebedora, Double valorEnviado){
        Conta.this.verificarSaldoNulo();
        recebedora.verificarSaldoNulo();

        if (Conta.this.getSaldoConta() < valorEnviado ){
            System.out.println("Conta " + Conta.this.getIdConta() + " sem saldo para efetuar a transferência: \n" +
                    "Saldo Atual: R$" + Conta.this.getSaldoConta()+
                    "\n_____________________________________________________");
        }else {
            Conta.this.setSaldoConta(Conta.this.getSaldoConta() - valorEnviado);
            recebedora.setSaldoConta(recebedora.getSaldoConta()+ valorEnviado);
            System.out.println("Transferência foi feita com sucesso \n=====================================================");
        }
    }
/*
    public void verificarDebitoClonado(Debito debito){
        verificarSaldoNulo();
        if  (debito.adicionarCliente(Conta.this) == true){
            if (debito.valor > this.getSaldoConta()) {

                System.out.println("CONTA SEM SALDO");

            }else {
                this.listaDebito.add(debito);
                this.setSaldoConta(getSaldoConta() - debito.valor);
                System.out.println("COMPRA EFETUADA COM SUCESSO");
            }

        }else {
            System.out.println("DEBITO CLONADO");
        }
    }
    public void verificarCreditoClonado(Credito credito){
        verificarSaldoNulo();
        if  (credito.adicionarCliente(Conta.this) == true){
            if (credito.valor > this.getSaldoConta()) {

                System.out.println("CONTA SEM SALDO");

            }else {
                this.listaCredito.add(credito);
                this.setSaldoConta(getSaldoConta() - credito.valor);
                System.out.println("COMPRA EFETUADA COM SUCESSO");
            }

        }else {
            System.out.println("CREDITO CLONADO");
        }
    }
 */
    public static class Debito {
        private  Double valor;
        private Integer maxConta = 1;
        private final Conta[] conta = new Conta[maxConta];
        private Integer quantidade = 0;

        public Debito(Double valor) {
            this.valor = valor;
        }
        public  Boolean adicionarCliente(Conta conta){
            int i;
            if (this.quantidade < this.maxConta){
                this.conta[quantidade] = conta;
                quantidade ++;
                return true;
            }else {
                return false;
            }
        }
    }
    public static class Credito {
        private  Double valor;
        private Integer maxConta = 1;
        private final Conta[] conta = new Conta[maxConta];
        private Integer quantidade = 0;

        public Credito(Double valor) {
            this.valor = valor;
        }
        public  boolean adicionarCliente(Conta conta){
            int i;
            if (this.quantidade < this.maxConta){
                this.conta[quantidade] = conta;
                quantidade ++;
                return true;
            }else {
                return false;
            }
        }
    }
}
