public class CompraConcreta1 extends CompraFactory {

    @Override
    Compra criarCompra(int idCompra, Usuario usuarioComprador) throws Exception {

        // aqui eu poderia colocar todo o tipo de validação, por exemplo:
        if (idCompra == 0 || usuarioComprador == null)
            throw new Exception("Os parametros não podem ser nulo ou zero!");

        return new Compra(idCompra, usuarioComprador);
    }

}
