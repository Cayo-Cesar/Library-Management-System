package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class livroDAO {

    public void adicionarLivro(livro livro) {
        Connection conn = Conexao.getConexao();
        try {
            if(livro.get_titulo().isEmpty() || livro.get_autor().isEmpty() || livro.get_genero().isEmpty()){
                System.out.println("Preencha todos os campos.");
                return;
            }

            else if(livro.get_ano() < 0){
                System.out.println("Ano de publicação inválido.");
                return;
            }

            else if (livro.get_titulo().length() > 100){
                System.out.println("Título muito grande.");
                return;
            }

            else if (livro.get_autor().length() > 100){
                System.out.println("Autor muito grande.");
                return;
            }

            else if (livro.get_genero().length() > 100){
                System.out.println("Gênero muito grande.");
                return;
            }

            else if (livro.get_disponivel() == false){
                System.out.println("Livro indisponível.");
                return;
            }

            else {
            String sql = "INSERT INTO livro (titulo, autor, editora, ano_publicacao) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, livro.get_titulo());
            ps.setString(2, livro.get_autor());
            ps.setInt(3, livro.get_ano());
            ps.setString(4, livro.get_genero());
            ps.executeUpdate();
            System.out.println("Livro cadastrado com sucesso.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirLivro(int idLivro) {
        Connection conn = Conexao.getConexao();
        try {
            String sql = "DELETE FROM livro WHERE id_livro = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idLivro);
            int rows = ps.executeUpdate();
            if (rows == 0) {
                System.out.println("Livro não encontrado.");
            } else {
                System.out.println("Livro excluído com sucesso.");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
