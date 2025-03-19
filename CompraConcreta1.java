public class CompraConcreta1 extends CompraFactory {

    @Override
    Compra criarCompra(int idCompra, Usuario usuarioComprador) throws Exception {

        // Aqui eu poderia colocar todo o tipo de validação, por exemplo:
        if (idCompra == 0 || usuarioComprador == null)
            throw new Exception("Os parametros não podem ser zero e/ou nulo!");

        return new Compra(idCompra, usuarioComprador);
    }

}
