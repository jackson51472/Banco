public class Endereco {
    private String  estado;
    private String cidade;
    private String cep;
    private String numero;
    private String rua;
    private Integer maxCliente = 1;
    private final Cliente cliente[] = new Cliente[maxCliente];
    private Integer quantidade = 0;

    public Endereco(String estado , String cidade,String cep, String numero, String rua){
        this.setEstado(estado);
        this.setCidade(cidade);
        this.setCep(cep);
        this.setRua(rua);
        this.setNumero(numero);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public  void adicionarEndereco(Cliente cliente){
        if (this.quantidade < this.maxCliente){
            this.cliente[quantidade] = cliente;
            cliente.adicionarEndereco(Endereco.this);
            this.quantidade ++;
        }else System.out.println("ENDEREÇO SÓ PODE PERTENCER HA 1 CLIENTE");
    }

/*
    public void imprimirEnderco(Cliente cliente){
        for (int i = 0; i < cliente.getListaEndereco().size(); i ++){

            Endereco e = cliente.getListaEndereco().get(i);
            System.out.println("Estado: " + e.estado + "\nCidade: " + e.cidade + " || CEP: " + e.cep + "\nRua: " +
                               e.rua + "\nNumero casa: " + e.numero + "\n========================================");

        }
    }

 */
}
