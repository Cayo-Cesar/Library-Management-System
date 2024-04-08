
// No changes needed, remove the import statement for java.lang.String
package biblioteca;

import java.util.ArrayList;

public class usuario {

    int id_usuario;
    String nome;
    int idade;
    String endereco;
    String telefone;
    ArrayList<String> LivrosEmprestados = new ArrayList<String>();

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

    public ArrayList<String> get_LivrosEmprestados() {
        return LivrosEmprestados;
    }

    public void set_LivrosEmprestados(ArrayList<String> LivrosEmprestados) {
        this.LivrosEmprestados = LivrosEmprestados;
    }

    public void emprestarLivro(String livro) {
        LivrosEmprestados.add(livro);
    }
}
