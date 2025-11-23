package meuempresa.supermercado;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }

    void alterarQuantidade(int novaQuantidade) {
        quantidadeEmEstoque = novaQuantidade;
    }

    void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}
