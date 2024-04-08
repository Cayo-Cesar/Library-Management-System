package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class gerenciadorUsuarios {
    private Map<Integer, usuario> usuarios;

    public gerenciadorUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void adicionarUsuario(usuario usuario) {
        usuario.set_id_usuario(usuarios.size() + 1);
        usuarios.put(usuario.get_id_usuario(), usuario);
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
            System.out.println("ID: " + usuario.get_id_usuario() + ", Nome: " + usuario.get_nome());
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
}
