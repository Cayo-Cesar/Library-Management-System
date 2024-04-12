
// No changes needed, remove the import statement for java.lang.String
package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class usuario {

    private int id_usuario;
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    
    public usuario() {
        this.livrosEmprestados = new ArrayList<>();
        this.dataEmprestimos = new HashMap<>();
    }

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
  }
}
