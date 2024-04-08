package biblioteca;

public class testeGerenciador {
    public static void main(String[] args) {
        
        System.out.println("Teste de gerenciador de biblioteca");

        // usuario usuario1 = new usuario();
        // usuario1.set_id_usuario(1);
        // usuario1.set_nome("João");
        // usuario1.set_idade(20);
        // usuario1.set_endereco("Rua A, 123");
        // usuario1.set_telefone("1234-5678");

        // usuario usuario2 = new usuario();
        // usuario2.set_id_usuario(2);
        // usuario2.set_nome("Maria");
        // usuario2.set_idade(25);
        // usuario2.set_endereco("Rua B, 456");
        // usuario2.set_telefone("8765-4321");

        // gerenciadorUsuarios gerenciador = new gerenciadorUsuarios();
        // gerenciador.adicionarUsuario(usuario1);
        // gerenciador.adicionarUsuario(usuario2);

        // gerenciador.listarUsuarios();

        // usuario usuarioBuscado = gerenciador.buscarUsuario(1);
        // System.out.println("Usuário buscado: " + usuarioBuscado.get_nome());

        // gerenciador.excluirUsuario(1);
        // gerenciador.listarUsuarios();

        // livro livro1 = new livro();
        // livro1.set_id_livro(1);
        // livro1.set_titulo("Dom Casmurro");
        // livro1.set_autor("Machado de Assis");
        // livro1.set_ano(1899);
        
        // livro livro2 = new livro();
        // livro2.set_id_livro(2);
        // livro2.set_titulo("O Cortiço");
        // livro2.set_autor("Aluísio Azevedo");
        // livro2.set_ano(1890);

        // gerenciadorLivros gerenciadorLivros = new gerenciadorLivros();
        // gerenciadorLivros.adicionarLivro(livro1);
        // gerenciadorLivros.adicionarLivro(livro2);

        // gerenciadorLivros.listarLivros();

        // livro livroBuscado = gerenciadorLivros.buscarLivro(1);
        // System.out.println("Livro buscado: " + livroBuscado.get_titulo());

        // gerenciadorLivros.excluirLivro(1);
        // gerenciadorLivros.listarLivros();



         // Teste de empréstimo e devolução de livros

         gerenciadorUsuarios gerenciadorUsuarios = new gerenciadorUsuarios();

         gerenciadorLivros gerenciadorLivros = new gerenciadorLivros();
 
         usuario usuario = new usuario();
         usuario.set_nome("João");
         usuario.set_idade(20);
         usuario.set_endereco("Rua A, 123");
         usuario.set_telefone("1234-5678");
 
         livro livro = new livro();
         livro.set_titulo("O Senhor dos Anéis");
         livro.set_autor("J.R.R. Tolkien");
         livro.set_ano(1954);
         livro.set_genero("Fantasia");
 
         gerenciadorUsuarios.adicionarUsuario(usuario);
         gerenciadorLivros.adicionarLivro(livro);
 
         System.out.println("Antes do empréstimo:");
         gerenciadorUsuarios.listarUsuarios();
         gerenciadorLivros.listarLivros();
 
         gerenciadorUsuarios.emprestarLivro(usuario, livro);
 
         System.out.println("\nDepois do empréstimo:");
         gerenciadorUsuarios.listarUsuarios();
         gerenciadorLivros.listarLivros();
 
         gerenciadorUsuarios.devolverLivro(usuario, livro);

         System.out.println("\nDepois da devolução:");
         gerenciadorUsuarios.listarUsuarios();
         gerenciadorLivros.listarLivros();
    }
}
