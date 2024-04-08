package biblioteca;

public class testeGerenciador {
    public static void main(String[] args) {
        System.out.println("Teste");

        usuario usuario1 = new usuario();
        usuario1.set_id_usuario(1);
        usuario1.set_nome("João");
        usuario1.set_idade(20);
        usuario1.set_endereco("Rua A, 123");
        usuario1.set_telefone("1234-5678");

        usuario usuario2 = new usuario();
        usuario2.set_id_usuario(2);
        usuario2.set_nome("Maria");
        usuario2.set_idade(25);
        usuario2.set_endereco("Rua B, 456");
        usuario2.set_telefone("8765-4321");

        gerenciadorUsuarios gerenciador = new gerenciadorUsuarios();
        gerenciador.adicionarUsuario(usuario1);
        gerenciador.adicionarUsuario(usuario2);

        gerenciador.listarUsuarios();

        usuario usuarioBuscado = gerenciador.buscarUsuario(1);
        System.out.println("Usuário buscado: " + usuarioBuscado.get_nome());

        gerenciador.excluirUsuario(1);
        gerenciador.listarUsuarios();

    }
}
