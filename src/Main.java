import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Romelzão");

        ContaCorrente conta1 = new ContaCorrente(cliente);

        ContaPoupanca conta2 = new ContaPoupanca(cliente);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }

}