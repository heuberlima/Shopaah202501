public class zShopaah2 {

    public static void main(String[] args) {

        /*
         * Funcionalidades:
         * 
         * 1. Criar pelo menos 3 objetos do tipo Produto para popular o sistema.
         * 2. Criar pelo menos 2 objetos do tipo Usuario.
         * 3. Adicionar produtos aos favoritos de um usuário.
         * 4. Remover produtos dos favoritos de um usuário.
         * 5. Criar uma compra com um usuário comprador e uma lista de produtos
         * comprados.
         * 6. Exibir detalhes de uma compra, incluindo os produtos comprados e o total.
         * 7. Permitir que um usuário adicione um produto ao carrinho de compras
         * (opcional).
         */

        // Criando instâncias de Usuario e Produto
        Produto produto1 = new Produto(101, "Notebook", "Notebook de última geração", 4500.00, 10);
        Produto produto2 = new Produto(102, "Mouse", "Mouse sem fio", 150.00, 50);
        Produto produto3 = new Produto(103, "Monitor", "Monitor 24 polegadas", 2500.00, 3);

        Usuario usuario1 = new Usuario(1, "João Silva", "joao@exemplo.com");
        Usuario usuario2 = new Usuario(2, "José Silva", "");

        usuario1.adicionarFavorito(produto1);
        usuario2.adicionarFavorito(produto2);
        usuario1.adicionarFavorito(produto3);
        usuario2.adicionarFavorito(produto1);
        usuario1.adicionarFavorito(produto2);
        usuario2.adicionarFavorito(produto3);

        usuario2.removerFavorito(produto3);

        // Cria o objeto da fabrica de compras
        CompraConcreta2 fabricaCompras = new CompraConcreta2();

        Compra compra = null;
        try {
            compra = fabricaCompras.criarCompra(2, usuario2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Adicionando produtos à compra
        compra.adicionarProdutoListaCompras(produto1);
        compra.adicionarProdutoListaCompras(produto2);

        // Exibindo detalhes da compra
        compra.exibirDetalhes();

        System.out.println();
        System.out.println("===================================");
        compra.adicionarProdutoListaCompras(produto3);
        compra.exibirDetalhes();

    }
}
