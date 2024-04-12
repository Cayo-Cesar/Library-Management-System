package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class emprestimoDAO {
    
    public void adicionarEmprestimo(emprestimo emprestimo) {
        Connection conn = Conexao.getConexao();
        try {
            if(emprestimo.get_id_usuario() < 0 || emprestimo.get_id_livro() < 0){
                System.out.println("Preencha todos os campos.");
                return;
            }

            else {
            String sql = "INSERT INTO emprestimo (id_usuario, id_livro) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, emprestimo.get_id_usuario());
            ps.setInt(2, emprestimo.get_id_livro());
            ps.executeUpdate();
            System.out.println("Empréstimo cadastrado com sucesso.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirEmprestimo(int idEmprestimo) {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "DELETE FROM emprestimo WHERE id_emprestimo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idEmprestimo);
            ps.executeUpdate();
            System.out.println("Empréstimo excluído com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void listarEmprestimos() {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "SELECT * FROM emprestimo";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID do empréstimo: " + rs.getInt("id_emprestimo"));
                System.out.println("ID do usuário: " + rs.getInt("id_usuario"));
                System.out.println("ID do livro: " + rs.getInt("id_livro"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void listarEmprestimosUsuario(int idUsuario) {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "SELECT * FROM emprestimo WHERE id_usuario = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID do empréstimo: " + rs.getInt("id_emprestimo"));
                System.out.println("ID do usuário: " + rs.getInt("id_usuario"));
                System.out.println("ID do livro: " + rs.getInt("id_livro"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
}
    }
}
