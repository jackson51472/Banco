public abstract class Pessoa {
    private String nome, telefone, cpf;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome,String telefone,String cpf){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setCpf(cpf);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
