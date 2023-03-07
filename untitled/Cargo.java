import java.util.ArrayList;

public class Cargo {
    private String nomeCargo;
    private Double salario;
    private ArrayList<Funcionario> funcionario = new ArrayList<>();

    public Cargo(String nomeCargo , Double salario){
        this.setNomeCargo(nomeCargo);
        this.setSalario(salario);
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public  void adicionarCargo(Funcionario funcionario){

        this.funcionario.add(funcionario);
        funcionario.adicionarCargo(Cargo.this);

    }
}
