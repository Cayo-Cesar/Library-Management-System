package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class gerenciadorLivros {
    private Map<Integer, livro> livros;

    public gerenciadorLivros() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(livro livro) {
        livros.put(livro.get_id_livro(), livro);
    }

    public livro buscarLivro(int idLivro) {
        return livros.get(idLivro);
    }

    public void listarLivros() {
        System.out.println("Lista de Livros:");
        for (livro livro : livros.values()) {
            System.out.println("ID: " + livro.get_id_livro() + ", Título: " + livro.get_titulo());
        }
    }
}