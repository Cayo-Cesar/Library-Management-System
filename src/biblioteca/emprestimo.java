package biblioteca;

import java.util.Date;

public class emprestimo {
    private int id_emprestimo;
    private int id_usuario;
    private int id_livro;
    private Date data_emprestimo;
    private Date data_devolucao;
    private boolean devolvido;

    public int get_id_emprestimo() {
        return id_emprestimo;
    }

    public void set_id_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public int get_id_usuario() {
        return id_usuario;
    }

    public void set_id_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int get_id_livro() {
        return id_livro;
    }

    public void set_id_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public Date get_data_emprestimo() {
        return data_emprestimo;
    }

    public void set_data_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public Date get_data_devolucao() {
        return data_devolucao;
    }

    public void set_data_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public boolean is_devolvido() {
        return devolvido;
    }

    public void set_devolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
