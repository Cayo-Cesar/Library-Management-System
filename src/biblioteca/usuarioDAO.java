package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarioDAO {

    public void adicionarUsuario(usuario usuario) {
        Connection conn = Conexao.getConexao();
        try {
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

    public void excluirUsuario(int idUsuario) {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "DELETE FROM usuario WHERE id_usuario = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idUsuario);
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
