package biblioteca;

import java.sql.Connection;

public class teste {
    public static void main(String[] args) {

        System.out.println("Teste de biblioteca no Banco de Dados!");

        // Chamando o método estático usando o nome da classe
        Connection conexao = Conexao.getConexao();

        // Testando a conexão
        System.out.println(conexao);

        System.out.println("Fim do teste!");
    }
}