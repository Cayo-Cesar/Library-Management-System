// No changes needed, remove the import statement for java.lang.String
package biblioteca;

public class usuario {

    int id_usuario;
    String nome;
    int idade;
    String endereco;
    String telefone;
    String LivrosEmprestados[] = new String[5];

    public int get_id_usuario() {
        return id_usuario;
    }

    public void set_id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String get_nome() {
        return nome;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }

    public int get_idade() {
        return idade;
    }

    public void set_idade(int idade) {
        this.idade = idade;
    }

    public String get_endereco() {
        return endereco;
    }

    public void set_endereco(String endereco) {
        this.endereco = endereco;
    }

    public String get_telefone() {
        return telefone;
    }

    public void set_telefone(String telefone) {
        this.telefone = telefone;
    }

    public String[] get_LivrosEmprestados() {
        return LivrosEmprestados;
    }

    public void set_LivrosEmprestados(String[] LivrosEmprestados) {
        this.LivrosEmprestados = LivrosEmprestados;
    }




    
}
