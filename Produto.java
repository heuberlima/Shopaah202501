public class Produto {
    private int idProduto;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(int idProduto, String nome, String descricao, double preco, int quantidadeEstoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e Setters
    public void atualizarEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método previsto no escopo do negócio
    @Override
    public String toString() {
        return "ID: " + idProduto +
                "\nNome: " + nome +
                "\nDescrição: " + descricao +
                "\nPreço: R$" + preco +
                "\nQuantidade em Estoque: " + quantidadeEstoque + "\n";
    }
}