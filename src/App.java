import entities.CartaoDeCredito;
import entities.Cliente;

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
    }
}
