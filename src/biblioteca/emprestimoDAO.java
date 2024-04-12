package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.Statement;

public class emprestimoDAO {
    
    public void adicionarEmprestimo(emprestimo emprestimo) {
        Connection conn = Conexao.getConexao();
        try {
            
            if(emprestimo.get_data_emprestimo() == null || emprestimo.get_data_devolucao() == null || emprestimo.get_id_usuario() == 0 || emprestimo.get_id_livro() == 0){
                System.out.println("Preencha todos os campos.");
                return;
            }

            else if(emprestimo.is_devolvido() == true){
                System.out.println("Livro já devolvido.");
            }

            else if(emprestimo.get_data_emprestimo().after(emprestimo.get_data_devolucao())){
                System.out.println("Data de devolução inválida.");
                return;
            }

            else if(emprestimo.get_data_emprestimo().before(new Date())){
                System.out.println("Data de empréstimo inválida.");
                return;
            }

            else if(emprestimo.get_id_usuario() < 0 || emprestimo.get_id_livro() < 0){
                System.out.println("ID do usuário ou ID do livro inválido.");
                return;
            }

            else {
            String sql = "INSERT INTO emprestimo (id_usuario, id_livro, data_emprestimo, data_devolucao, devolvido) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, emprestimo.get_id_usuario());
            ps.setInt(2, emprestimo.get_id_livro());
            ps.setDate(3, (java.sql.Date) emprestimo.get_data_emprestimo());
            ps.setDate(4, (java.sql.Date) emprestimo.get_data_devolucao());
            ps.setBoolean(5, emprestimo.is_devolvido());
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
                System.out.println("Data de empréstimo: " + rs.getDate("data_emprestimo"));
                System.out.println("Data de devolução: " + rs.getDate("data_devolucao"));
                System.out.println("Devolvido: " + rs.getBoolean("devolvido"));
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
                System.out.println("Data de empréstimo: " + rs.getDate("data_emprestimo"));
                System.out.println("Data de devolução: " + rs.getDate("data_devolucao"));
                System.out.println("Devolvido: " + rs.getBoolean("devolvido"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
}
    }
}
