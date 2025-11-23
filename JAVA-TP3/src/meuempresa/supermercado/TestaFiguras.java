package meuempresa.supermercado;

public class TestaFiguras {
    public static void main(String[] args) {
        // Teste da classe Produto
        Produto p = new Produto();
        p.nome = "Arroz";
        p.preco = 5.50;
        p.quantidadeEmEstoque = 100;
        p.alterarPreco(6.00);
        p.alterarQuantidade(90);
        System.out.println("Produto");
        p.exibirInformacoes();

        // Teste da classe Conta
        Conta c = new Conta();
        c.titular = "João";
        c.numero = 12345;
        c.agencia = "0001";
        c.saldo = 1000;
        c.dataAbertura = "01/01/2025";
        c.deposita(200);
        c.saca(500);
        System.out.println("Conta Bancária");
        System.out.println("Saldo atual: " + c.saldo);
        System.out.println("Rendimento: " + c.calculaRendimento());

        // Teste da classe Circulo
        Circulo cir = new Circulo();
        cir.raio = 3.0;
        System.out.println("Círculo");
        System.out.println("Área do círculo: " + cir.calcularArea());

        // Teste da classe Esfera
        Esfera esf = new Esfera();
        esf.raio = 5.0;
        System.out.println("Esfera");
        System.out.println("Volume da esfera: " + esf.calcularVolume());
    }
}
