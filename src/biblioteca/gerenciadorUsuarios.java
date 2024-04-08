package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class gerenciadorUsuarios {
    private Map<Integer, usuario> usuarios;

    public gerenciadorUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void adicionarUsuario(usuario usuario) {
        usuarios.put(usuario.get_id_usuario(), usuario);
    }

    public usuario buscarUsuario(int idUsuario) {
        return usuarios.get(idUsuario);
    }

    public void listarUsuarios() {
        System.out.println("Lista de Usuários:");
        for (usuario usuario : usuarios.values()) {
            System.out.println("ID: " + usuario.get_id_usuario() + ", Nome: " + usuario.get_nome());
        }
    }
}
