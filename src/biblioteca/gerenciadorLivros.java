package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class gerenciadorLivros {
    private Map<Integer, livro> livros;

    public gerenciadorLivros() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(livro livro) {
        try {
            livro.set_id(livros.size() + 1);
            livros.put(livro.get_id_livro(), livro);
        } catch (Exception e) {
            livro.set_id(1);
        }
    }

    public livro buscarLivro(int idLivro) {
        try {
            return livros.get(idLivro);
        } catch (Exception e) {
            System.out.println("Livro não encontrado.");
        }
        return null;
    }

    public void listarLivros() {
        try {
            System.out.println("Lista de Livros:");
            for (livro livro : livros.values()) {
                System.out.println("ID: " + livro.get_id_livro() + ", Título: " + livro.get_titulo());
            }
        } catch (Exception e) {
            System.out.println("Não há livros cadastrados.");
        }
    }

    public void excluirLivro(int idLivro) {
        try {
            for (livro livro : livros.values()) {
                if (livro.get_id_livro() > idLivro) {
                    livro.set_id(livro.get_id_livro() - 1);
                    livros.remove(idLivro);
                }
            }
        } catch (Exception e) {
            System.out.println("Livro não encontrado.");
        }
    }
}