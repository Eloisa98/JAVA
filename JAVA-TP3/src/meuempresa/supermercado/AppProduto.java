package meuempresa.supermercado;

class AppConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.titular = "João";
        c.numero = 12345;
        c.agencia = "0001";
        c.saldo = 1000;
        c.dataAbertura = "01/01/2025";

        c.deposita(200);
        c.saca(500);

        System.out.println("Saldo atual: " + c.saldo);
        System.out.println("Rendimento: " + c.calculaRendimento());
    }
}
