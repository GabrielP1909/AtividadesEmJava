import banco.ContaBancaria;

public class MainConta {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Maria", 1000.00);

        conta.depositar(500.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(200.00);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        conta.sacar(1500.00);
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}