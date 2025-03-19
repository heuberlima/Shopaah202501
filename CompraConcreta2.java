public class CompraConcreta2 extends CompraFactory {

    @Override
    Compra criarCompra(int idCompra, Usuario usuarioComprador) throws Exception {

        // aqui eu poderia colocar todo o tipo de validação, por exemplo:
        if (usuarioComprador.getEmail().isEmpty())
            throw new Exception("Só são permitidos usuários com email válido!");

        return new Compra(idCompra, usuarioComprador);
    }

}
