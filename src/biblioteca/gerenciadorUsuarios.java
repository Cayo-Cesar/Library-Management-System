package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class gerenciadorUsuarios {
    private Map<Integer, usuario> usuarios;

    public gerenciadorUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void adicionarUsuario(usuario usuario) {
        try {
            usuario.set_id_usuario(usuarios.size() + 1);
        } catch (Exception e) {
            usuario.set_id_usuario(1);
        }
        usuarios.put(usuario.get_id_usuario(), usuario);
    }

    public usuario buscarUsuario(int idUsuario) {
        try {
            return usuarios.get(idUsuario);
        } catch (Exception e) {
            System.out.println("Usuário não encontrado.");
        }
        return null;
    }

    public void listarUsuarios() {
        try {
            System.out.println("Lista de Usuários:");
            for (usuario usuario : usuarios.values()) {
                System.out.println("ID: " + usuario.get_id_usuario() + ", Nome: " + usuario.get_nome());
            }
        } catch (Exception e) {
            System.out.println("Não há usuários cadastrados.");
        }
    }

    public void excluirUsuario(int idUsuario) {
        try {
            for (usuario usuario : usuarios.values()) {
                if (usuario.get_id_usuario() > idUsuario) {
                    usuario.set_id_usuario(usuario.get_id_usuario() - 1);
                    usuarios.remove(idUsuario);
                }
            }
        } catch (Exception e) {
            System.out.println("Usuário não encontrado.");
        }
    }
}
