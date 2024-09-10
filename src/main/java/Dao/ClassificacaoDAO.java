package Dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Classificacao;
import util.PostgresConnection;

public class ClassificacaoDAO {
	 // Método para listar todas as classificações do banco de dados
    public List<Classificacao> listAll() throws SQLException {
    	 PostgresConnection conn = new PostgresConnection();
         Connection conexao= conn.getConnection();
        	
            
            
            List<Classificacao> classificacoes = new ArrayList<>();
                       try {
            	String sql = "SELECT * FROM classificacao";
            	PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                	 Classificacao classificacao = new Classificacao();

                    classificacao.setIdclassificacao(rs.getInt("idclassificacao"));
                    classificacao.setClassificacao(rs.getString("classificacao"));

                    classificacoes.add(classificacao);
                }
                conexao.close();
                } catch (Exception e) {
                	e.printStackTrace();
                    System.out.println("Erro no cadastro: "+e.getMessage());

			}
			 
		        return classificacoes;
    }
    //Método para criar uma nova classificação no banco de dados
    public void saveClassificacao(Classificacao classificacao) throws SQLException {
        
        PostgresConnection conn = new PostgresConnection();
        Connection conexao= conn.getConnection();
        try  {
        	String sql = "INSERT INTO classificacao (classificacao) VALUES (?)";
        	 PreparedStatement ptmt= conexao.prepareStatement(sql);
            ptmt.setString(1, classificacao.getClassificacao());
            ptmt.executeUpdate();
        }catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Erro no cadastro: "+e.getMessage());
		}
        conexao.close();
    }
    public void updateClassificacao(Classificacao classificacao) throws SQLException {
      
    	 PostgresConnection conn = new PostgresConnection();
         Connection conexao= conn.getConnection();
        try {
        	 String sql = "UPDATE classificacao SET classificacao = ? WHERE idclassificacao = ?";
        	 PreparedStatement ptmt = conexao.prepareStatement(sql);
        	
        	 ptmt.setString(1, classificacao.getClassificacao());
        	 ptmt.setInt(2, classificacao.getIdclassificacao());
        	 ptmt.executeUpdate();
        }catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Erro no cadastro: "+e.getMessage());
		}
    }
    public void deleteClassificacao(Classificacao classificacao) throws SQLException {
        
        PostgresConnection conn = new PostgresConnection();
        Connection conexao= conn.getConnection();
        try  {
        	 String sql = "DELETE FROM classificacao WHERE idclassificacao = ?";
        	 PreparedStatement ptmt = conexao.prepareStatement(sql);
        	 ptmt.setInt(1, classificacao.getIdclassificacao());
        	 ptmt.executeUpdate();
        }catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Erro no cadastro: "+e.getMessage());
		}
    }
/*
    // Método para ler uma classificação do banco de dados pelo id
    public Classificacao read(int id) throws SQLException {
        String sql = "SELECT * FROM classificacao WHERE idclassificacao = ?";
        Classificacao classificacao = null;

        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                classificacao = new Classificacao(id, sql);
                classificacao.setIdclassificacao(rs.getInt("idclassificacao"));
                classificacao.setClassificacao(rs.getString("classificacao"));
            }
        }

        return classificacao;
    }
    

    // Método para atualizar uma classificação no banco de dados
   

    // Método para deletar uma classificação do banco de dados
  
*/
   
    
      

    /*/ Método para listar classificações com paginação
    public List<Classificacao> listWithPagination(int offset, int limit) throws SQLException {
        String sql = "SELECT * FROM classificacao ORDER BY idclassificacao LIMIT ? OFFSET ?";
        List<Classificacao> classificacoes = new ArrayList<>();

        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, limit);
            stmt.setInt(2, offset);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                 Classificacao classificacao = new Classificacao();
                classificacao.setIdclassificacao(rs.getInt("idclassificacao"));
                classificacao.setClassificacao(rs.getString("classificacao"));

                classificacoes.add(classificacao);
            }
        }

        return classificacoes;
    }

    // Método para contar o número total de classificações
    public int countAll() throws SQLException {
        String sql = "SELECT COUNT(*) AS total FROM classificacao";
        int total = 0;

        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                total = rs.getInt("total");
            }
        }

        return total;
    }*/
}
