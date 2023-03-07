import java.util.ArrayList;

public class Funcionario extends Pessoa implements IUser{

    private ArrayList<Cargo> cargo = new ArrayList<>();

    public Funcionario(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }
    public ArrayList<Cargo> getCargo() {
        return cargo;
    }

    public void setCargo(ArrayList<Cargo> cargo) {
        this.cargo = cargo;
    }

    public void adicionarCargo(Cargo cargo){
        this.cargo.add(cargo);
    }
}
