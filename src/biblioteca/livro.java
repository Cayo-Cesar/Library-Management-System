package biblioteca;

public class livro {

    private int id_livro;
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private String disponivel;

    public int get_id_livro() {
        return id_livro;
    }

    public void set_id_livro(int id_livro) {
        this.id_livro = id_livro;
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

    public String get_disponivel() {
        return disponivel;
    }

    public void set_disponivel(String disponivel) {
        this.disponivel = disponivel;
    }
}
    
