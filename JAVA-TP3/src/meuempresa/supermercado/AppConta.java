package meuempresa.supermercado;

class AppProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Arroz";
        p.preco = 5.50;
        p.quantidadeEmEstoque = 100;

        p.alterarPreco(6.00);
        p.alterarQuantidade(90);

        p.exibirInformacoes();
    }
}
