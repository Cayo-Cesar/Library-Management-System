package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class usuarioDAO {

    public void adicionarUsuario(usuario usuario) {
        Connection conn = Conexao.getConexao();
        try {
            // Verificar se já existe um usuário com o mesmo nome ou telefone
            String verificaExistenciaSql = "SELECT COUNT(*) FROM usuario WHERE nome = ? OR telefone = ?";
            PreparedStatement verificaExistenciaPs = conn.prepareStatement(verificaExistenciaSql);
            verificaExistenciaPs.setString(1, usuario.get_nome());
            verificaExistenciaPs.setString(2, usuario.get_telefone());
            ResultSet resultado = verificaExistenciaPs.executeQuery();
            resultado.next();
            int totalUsuarios = resultado.getInt(1);
            if (totalUsuarios > 0) {
                System.out.println("Já existe um usuário com o mesmo nome ou telefone cadastrado.");
                return;
            }

            // Inserir o novo usuário se não houver duplicatas
            String sql = "INSERT INTO usuario (nome, idade, endereco, telefone) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.get_nome());
            ps.setInt(2, usuario.get_idade());
            ps.setString(3, usuario.get_endereco());
            ps.setString(4, usuario.get_telefone());
            ps.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarUsuario(usuario usuario) {
        Connection conn = Conexao.getConexao();

        if (usuario.get_nome().isEmpty() || usuario.get_endereco().isEmpty() || usuario.get_telefone().isEmpty()) {
            System.out.println("Preencha todos os campos.");
            return;
        } else if (usuario.get_idade() < 0) {
            System.out.println("Idade inválida.");
            return;
        } else if (usuario.get_nome().length() > 100) {
            System.out.println("Nome muito grande.");
            return;
        } else if (usuario.get_endereco().length() > 100) {
            System.out.println("Endereço muito grande.");
            return;
        } else if (usuario.get_telefone().length() > 20) {
            System.out.println("Telefone muito grande.");
            return;
        } else if (usuario.get_id_usuario() < 0) {
            System.out.println("ID de usuário inválido.");
            return;
        } else if (usuario.get_idade() < 0) {
            System.out.println("Idade inválida.");
            return;
        } else if (usuario.get_id_usuario() < 0) {
            System.out.println("ID de usuário inválido.");
            return;
        } else if (usuario.get_idade() < 0) {
            System.out.println("Idade inválida.");
            return;
        }

        try {
            String sql = "UPDATE usuario SET nome = ?, idade = ?, endereco = ?, telefone = ? WHERE id_usuario = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.get_nome());
            ps.setInt(2, usuario.get_idade());
            ps.setString(3, usuario.get_endereco());
            ps.setString(4, usuario.get_telefone());
            ps.setInt(5, usuario.get_id_usuario());

            int rows = ps.executeUpdate();
            if (rows == 0) {
                System.out.println("Usuário não encontrado.");
            } else {
                System.out.println("Usuário atualizado com sucesso.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void excluirUsuario(usuario idUsuario) {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "DELETE FROM usuario WHERE id_usuario = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idUsuario.get_id_usuario());
            int rows = ps.executeUpdate();
            if (rows == 0) {
                System.out.println("Usuário não encontrado.");
            } else {
                System.out.println("Usuário excluído com sucesso.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarUsuarios() {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "SELECT * FROM usuario";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            System.out.println("Lista de Usuários:");
            while (ps.getResultSet().next()) {
                int idUsuario = ps.getResultSet().getInt("id_usuario");
                String nome = ps.getResultSet().getString("nome");
                int idade = ps.getResultSet().getInt("idade");
                String endereco = ps.getResultSet().getString("endereco");
                String telefone = ps.getResultSet().getString("telefone");
                System.out.println("ID: " + idUsuario + ", Nome: " + nome + ", Idade: " + idade + ", Endereço: " + endereco + ", Telefone: " + telefone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
