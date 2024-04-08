package biblioteca;

public class cadastroUsuario {
    
    public void cadastrarUsuario(usuario usuario) {
        
        String nome = usuario.get_nome();
        int idade = usuario.get_idade();
        String telefone = usuario.get_telefone();
        String endereco = usuario.get_endereco();

        System.out.println("Usuário cadastrado com sucesso!");

    }

    public void excluirUsuario(usuario usuario) {
        
        String nome = usuario.get_nome();
        int idade = usuario.get_idade();
        String telefone = usuario.get_telefone();
        String endereco = usuario.get_endereco();

        System.out.println("Usuário excluído com sucesso!");

    }

    public void alterarUsuario(usuario usuario) {
        
        String nome = usuario.get_nome();
        int idade = usuario.get_idade();
        String telefone = usuario.get_telefone();
        String endereco = usuario.get_endereco();

        System.out.println("Usuário alterado com sucesso!");

    }

    public void listarUsuarios(usuario usuario) {
        
        String nome = usuario.get_nome();
        int idade = usuario.get_idade();
        String telefone = usuario.get_telefone();
        String endereco = usuario.get_endereco();

        System.out.println("Usuário listado com sucesso!");

    }
        
}
