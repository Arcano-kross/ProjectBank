import entities.Agencia;
import entities.CartaoDeCredito;
import entities.Cliente;
import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        c1.nome = "rafael cosentino";
        c1.codigo = 1;

        Cliente c2 = new Cliente();
        c2.nome = "Jonas hirata";
        c2.codigo = 2;

        System.out.println("Dados do primeiro Cliente");
        System.out.println("Nome " + c1.nome);
        System.out.println("Codigo " + c1.codigo);

        System.out.println("------------------------------");

        System.out.println("Dados do segundo Cliente");
        System.out.println("Nome " + c2.nome);
        System.out.println("Codigo " + c2.codigo);

        System.out.println("------------------------------");

        CartaoDeCredito cdc1 = new CartaoDeCredito();
        cdc1.numero = 111111;
        cdc1.dataDeValidade = " 01/01/2013 ";

        CartaoDeCredito cdc2 = new CartaoDeCredito();
        cdc2.numero = 222222;
        cdc2.dataDeValidade = " 01/01/2014 ";

        System.out.println(" Dados do primeiro cartão ");
        System.out.println(" Número : " + cdc1.numero);
        System.out.println(" Data de validade : " + cdc1.dataDeValidade);

        System.out.println(" ----------------------------------------");

        System.out.println(" Dados do segundo cartão ");
        System.out.println(" Número : " + cdc2.numero);
        System.out.println(" Data de validade : " + cdc2.dataDeValidade);

        System.out.println("------------------------------------------");

        Agencia a1 = new Agencia();
        a1.numero = 1234;
        System.out.println("Dados da primeira agencia");
        System.out.println("Numero: "+ a1.numero);

        Agencia a2 = new Agencia();
        a2.numero = 5678;
        System.out.println("Dados da primeira agencia");
        System.out.println("Numero: "+ a2.numero);

        System.out.println("-----------------------------------------");

        Conta co1 = new Conta();
        co1.numero = 1234;
        co1.saldo = 1000;
        co1.limite = 500;

        Conta co2 = new Conta();
        co2.numero = 5678;
        co2.saldo = 2000;
        co2.limite = 250;

        System.out.println("Dados da primeira conta");
        System.out.println("Numero: "+ co1.numero);
        System.out.println("Saldo: "+ co1.saldo);
        System.out.println("Limite: "+ co1.limite);

        System.out.println("--------------------------------");

        
        System.out.println("Dados da segunda conta");
        System.out.println("Numero: "+ co2.numero);
        System.out.println("Saldo: "+ co2.saldo);
        System.out.println("Limite: "+ co2.limite);
    }
}
