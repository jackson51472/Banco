public class Exec {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Geraldo","984362152","122.324.556",false);
        Cliente c2 = new Cliente("Jackson","998121089","315.674.906",true);

        //====================================
        Endereco e1 = new Endereco("RS","Caixias","87631-000","642","Rua Bascos");
        Endereco e2 = new Endereco("MG","Paiva","36195-000","54","Rua A");
        Endereco e3 = new Endereco("SP","São Paulo","10167-000","1167","Rua Chaves Almeida");

        //====================================
        ContaCorrente conta1 = new ContaCorrente("22hg34",500.);
        ContaPoupanca conta2 = new ContaPoupanca("34s21f");

        //====================================
        e1.adicionarEndereco(c1);
        e2.adicionarEndereco(c1);
        e3.adicionarEndereco(c1);

        //====================================
        c1.adicionarContas(conta1);
        conta1.depositar(1000.);

        //====================================
        c2.adicionarContas(conta2);
        conta2.depositar(1000.);


        Funcionario funcUm = new Funcionario("Jean" , "9999999","123564100");
        Funcionario funcDois = new Funcionario("Pedro" , "1234","125465723");

        Cargo cargoUm = new Cargo("ATENDENTE" , 1500.);
        Cargo cargoDois = new Cargo("GERENTE", 4000.);

        cargoUm.adicionarCargo(funcUm);
        cargoDois.adicionarCargo(funcDois);
    }
}
