package banco;

public class ContaBancaria {

    public String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro: valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}