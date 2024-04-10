package biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class gerenciadorUsuarios {
    private Map<Integer, usuario> usuarios;

    public gerenciadorUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void adicionarUsuario(usuario usuario) {
        usuario.set_id_usuario(usuarios.size() + 1);
        usuarios.put(usuario.get_id_usuario(), usuario);
        if (usuario.get_id_usuario() == usuarios.size()) {
            System.out.println("Usuário cadastrado com sucesso.");
        } else {
            System.out.println("Usuário cadastrado com sucesso.");
        }
    }

    public usuario buscarUsuario(int idUsuario) {
        usuario usuario = usuarios.get(idUsuario);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        }
        return usuario;
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
            return;
        }
        System.out.println("Lista de Usuários:");
        for (usuario usuario : usuarios.values()) {
            StringBuilder livrosEmprestados = new StringBuilder();
            for (livro livro : usuario.get_LivrosEmprestados()) {
                livrosEmprestados.append(livro.get_titulo()).append(", ");
            }
            // Removendo a vírgula e o espaço extra no final da lista
            String livrosEmprestadosString = livrosEmprestados.length() > 0 ? livrosEmprestados.substring(0, livrosEmprestados.length() - 2) : "";
            System.out.println("ID: " + usuario.get_id_usuario() + ", Nome: " + usuario.get_nome() + ", Idade: " + usuario.get_idade() + ", Endereço: " + usuario.get_endereco() + ", Telefone: " + usuario.get_telefone() + ", Livros Emprestados: " + livrosEmprestadosString);
        }
    }

    public void excluirUsuario(int idUsuario) {
        usuario usuario = usuarios.remove(idUsuario);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        // Atualizar IDs dos usuários restantes
        for (usuario u : usuarios.values()) {
            if (u.get_id_usuario() > idUsuario) {
                u.set_id_usuario(u.get_id_usuario() - 1);
            }
        }
    }

    public void emprestarLivro(usuario usuario, livro livro) {
        if (usuario != null && livro != null) {
            if(usuario.get_LivrosEmprestados().size() >= 3) {
                System.out.println("Usuário já possui 3 livros emprestados.");
                return;
            }
            usuario.adicionarLivroEmprestado(livro);
        }
    }

    public void devolverLivro(usuario usuario, livro livro) {
        double multa = 0;
        if (usuario != null && livro != null) {
            if (!usuario.get_LivrosEmprestados().contains(livro)) {
                System.out.println("Usuário não possui este livro emprestado.");
                return;
            }
            if (LocalDate.now().isAfter(usuario.getDataEmprestimo(livro).plusDays(7))) {
                System.out.println("Devolução atrasada. Usuário deve pagar multa.");
                long daysBorrowed = ChronoUnit.DAYS.between(usuario.getDataEmprestimo(livro), LocalDate.now());
                System.out.println("O livro foi emprestado por " + daysBorrowed + " dias.");
                multa = daysBorrowed * 0.5;
                System.out.println("Multa a ser paga: R$" + multa);
            }
            usuario.removerLivroEmprestado(livro);
        }
    }
}
