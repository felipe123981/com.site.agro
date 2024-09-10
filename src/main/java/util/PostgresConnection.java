package util;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

    // URL do banco de dados, incluindo o nome do banco
    private static final String URL = "jdbc:postgresql://localhost:5432/agro";
    
    // Nome de usuário e senha do banco de dados
    private static final String USER = "postgres"; // Substitua pelo seu usuário do PostgreSQL
    private static final String PASSWORD = "15975328"; // Substitua pela sua senha do PostgreSQL


    public Connection getConnection() throws SQLException {
        try {
            // Tenta carregar o driver JDBC do PostgreSQL
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver PostgreSQL não encontrado!", e);
        }

        // Retorna uma conexão para o banco de dados
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

 
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
