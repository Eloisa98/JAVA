package meuempresa.supermercado;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void deposita(double valor) {
        saldo += valor;
    }

    double calculaRendimento() {
        return saldo * 0.1;
    }
}
