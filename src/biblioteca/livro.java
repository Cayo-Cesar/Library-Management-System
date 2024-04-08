package biblioteca;

public class livro {

    int id;
    String titulo;
    String autor;
    int ano;
    String genero;
    boolean disponivel;

    public int get_id() {
        return id;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public String get_titulo() {
        return titulo;
    }

    public void set_titulo(String titulo) {
        this.titulo = titulo;
    }

    public String get_autor() {
        return autor;
    }

    public void set_autor(String autor) {
        this.autor = autor;
    }

    public int get_ano() {
        return ano;
    }

    public void set_ano(int ano) {
        this.ano = ano;
    }

    public String get_genero() {
        return genero;
    }

    public void set_genero(String genero) {
        this.genero = genero;
    }

    public boolean get_disponivel() {
        return disponivel;
    }

    public void set_disponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
    
