package biblioteca;

public class testesBiblioteca {

    public static void main(String[] args) {

        //cadastrar usuario
        usuario usuario = new usuario();
        usuario.set_nome("João");
        usuario.set_idade(20);
        usuario.set_endereco("Rua 1, 123");
        usuario.set_telefone("1234-5678");

        usuarioDAO usuarioDAO = new usuarioDAO();
        usuarioDAO.adicionarUsuario(usuario);
    }
}
