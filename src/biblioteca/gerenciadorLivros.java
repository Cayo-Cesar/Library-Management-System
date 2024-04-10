package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class gerenciadorLivros {
    private Map<Integer, livro> livros;


    public gerenciadorLivros() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(livro livro) {
        int novoId = livros.size() + 1;
        livro.set_id_livro(novoId);
        livros.put(novoId, livro);
        if (livros.containsKey(novoId)) {
            System.out.println("Livro cadastrado com sucesso.");
        } else {
            System.out.println("Erro ao cadastrar livro.");
        }
    }

    public livro buscarLivro(int idLivro) {
        return livros.get(idLivro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
            return;
        }
        System.out.println("Lista de Livros:");
        for (livro livro : livros.values()) {
            System.out.println("ID: " + livro.get_id_livro() + ", Título: " + livro.get_titulo());
        }
    }

    public void excluirLivro(int idLivro) {
        if (!livros.containsKey(idLivro)) {
            System.out.println("Livro não encontrado.");
            return;
        }

        livros.remove(idLivro);

        // Atualizar IDs dos livros restantes
        int novoId = 1;
        for (livro livro : livros.values()) {
            livro.set_id_livro(novoId++);
        }
    }
}
