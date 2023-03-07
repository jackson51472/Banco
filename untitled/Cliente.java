import java.util.ArrayList;

public class Cliente extends Pessoa implements IUser{
    private Boolean vip;
    private ArrayList<Endereco> listaEndereco = new ArrayList<>();
    private ArrayList<Conta> listaContas = new ArrayList<>();

    public Cliente(String nome, String telefone, String cpf, Boolean vip) {
        super(nome, telefone, cpf);
        this.setVip(vip);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }


    public ArrayList<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public void adicionarEndereco(Endereco endereco){
        this.listaEndereco.add(endereco);
    }

    public void imprimirEndereco(){
        for (int i = 0; i < getListaEndereco().size(); i ++){
            System.out.println( "Estado: " + getListaEndereco().get(i).getEstado() +
                                "\nCidade: " + getListaEndereco().get(i).getCidade() + " || CEP: " + getListaEndereco().get(i).getCep() +
                                "\nRua: " + getListaEndereco().get(i).getRua() +
                                "\nNumero casa: " + getListaEndereco().get(i).getNumero() +
                                "\n========================================");
        }
    }

    public void adicionarContas(Conta conta){
        if (conta.adicionarCliente(Cliente.this) == true){
            this.listaContas.add(conta);
        }else {
            System.out.println("CONTA JÁ PERTENCE A OUTRO CLIENTE");
        }
    }
}
