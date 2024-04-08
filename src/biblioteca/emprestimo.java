package biblioteca;

public class emprestimo {

    int id;
    String data_emprestimo;
    String data_devolucao;
    livro livro;
    usuario usuario;

    public int get_id() {
        return id;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public String get_data_emprestimo() {
        return data_emprestimo;
    }

    public void set_data_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String get_data_devolucao() {
        return data_devolucao;
    }

    public void set_data_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public livro get_livro() {
        return livro;
    }

    public void set_livro(livro livro) {
        this.livro = livro;
    }

    public usuario get_usuario() {
        return usuario;
    }

    public void set_usuario(usuario usuario) {
        this.usuario = usuario;
    }
}


