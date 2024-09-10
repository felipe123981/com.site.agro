

package Dao;




import util.PostgresConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ParceiroDAO {

/*
    public void addParceiro(Parceiro parceiro) {
        String sql = "INSERT INTO parceiro (nomepessoa, idendereco, usuariopessoa, senhapessoa, nivelpessoa, situacaopessoa, "
                + "emailpessoa, telefonepessoa, cnpjPessoaCnpj, razaoSocialPessoaCnpj, inscricaoEstadualPessoaCnpj, siteparceiro) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = PostgresConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, parceiro.getNomepessoa());
            stmt.setInt(2, parceiro.getEndereco().getIdendereco());  // Assumindo que Endereco tem uma chave estrangeira em 'parceiro'
            stmt.setString(3, parceiro.getUsuariopessoa());
            stmt.setString(4, parceiro.getSenhapessoa());
            stmt.setString(5, parceiro.getNivelpessoa());
            stmt.setBoolean(6, parceiro.isSituacaopessoa());
            stmt.setString(7, parceiro.getEmailpessoa());
            stmt.setString(8, parceiro.getTelefonepessoa());
            stmt.setString(9, parceiro.getCnpjPessoaCnpj());
            stmt.setString(10, parceiro.getRazaoSocialPessoaCnpj());
            stmt.setString(11, parceiro.getInscricaoEstadualPessoaCnpj());
            stmt.setString(12, parceiro.getSiteparceiro());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar o parceiro: " + e.getMessage(), e);
        }
    }

    public void updateParceiro(Parceiro parceiro) {
        String sql = "UPDATE parceiro SET nomepessoa = ?, idendereco = ?, usuariopessoa = ?, senhapessoa = ?, "
                + "nivelpessoa = ?, situacaopessoa = ?, emailpessoa = ?, telefonepessoa = ?, cnpjPessoaCnpj = ?, "
                + "razaoSocialPessoaCnpj = ?, inscricaoEstadualPessoaCnpj = ?, siteparceiro = ? WHERE idpessoa = ?";

        try (Connection conn = PostgresConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, parceiro.getNomepessoa());
            stmt.setInt(2, parceiro.getEndereco().getIdendereco());
            stmt.setString(3, parceiro.getUsuariopessoa());
            stmt.setString(4, parceiro.getSenhapessoa());
            stmt.setString(5, parceiro.getNivelpessoa());
            stmt.setBoolean(6, parceiro.isSituacaopessoa());
            stmt.setString(7, parceiro.getEmailpessoa());
            stmt.setString(8, parceiro.getTelefonepessoa());
            stmt.setString(9, parceiro.getCnpjPessoaCnpj());
            stmt.setString(10, parceiro.getRazaoSocialPessoaCnpj());
            stmt.setString(11, parceiro.getInscricaoEstadualPessoaCnpj());
            stmt.setString(12, parceiro.getSiteparceiro());
            stmt.setInt(13, parceiro.getIdpessoa());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o parceiro: " + e.getMessage(), e);
        }
    }

    public void deleteParceiro(int id) {
        String sql = "DELETE FROM parceiro WHERE idpessoa = ?";

        try (Connection conn = PostgresConnection.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar o parceiro: " + e.getMessage(), e);
        }
    }

    public Parceiro getParceiroById(int id) {
        String sql = "SELECT * FROM parceiro WHERE idpessoa = ?";
        Parceiro parceiro = null;

        try (Connection conn = PostgresConnection.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Endereco endereco = new EnderecoDAO().setEnderecoById(rs.getInt("idendereco"));  // Presumindo que há uma relação com a tabela de endereços

                parceiro = new Parceiro(
                        rs.getInt("idpessoa"),
                        rs.getString("nomepessoa"),
                        endereco,
                        rs.getString("usuariopessoa"),
                        rs.getString("senhapessoa"),
                        rs.getString("nivelpessoa"),
                        rs.getBoolean("situacaopessoa"),
                        rs.getString("emailpessoa"),
                        rs.getString("telefonepessoa"),
                        rs.getString("cnpjPessoaCnpj"),
                        rs.getString("razaoSocialPessoaCnpj"),
                        rs.getString("inscricaoEstadualPessoaCnpj"),
                        rs.getString("siteparceiro")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar o parceiro: " + e.getMessage(), e);
        }

        return parceiro;
    }

    public List<Parceiro> getAllParceiros() {
        String sql = "SELECT * FROM parceiro";
        List<Parceiro> parceiros = new ArrayList<>();

        try (Connection conn = PostgresConnection.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Endereco endereco = new EnderecoDAO().getIdendereco(rs.getInt("idendereco"));  // Presumindo que há uma relação com a tabela de endereços

                Parceiro parceiro = new Parceiro(
                        rs.getInt("idpessoa"),
                        rs.getString("nomepessoa"),
                        endereco,
                        rs.getString("usuariopessoa"),
                        rs.getString("senhapessoa"),
                        rs.getString("nivelpessoa"),
                        rs.getBoolean("situacaopessoa"),
                        rs.getString("emailpessoa"),
                        rs.getString("telefonepessoa"),
                        rs.getString("cnpjPessoaCnpj"),
                        rs.getString("razaoSocialPessoaCnpj"),
                        rs.getString("inscricaoEstadualPessoaCnpj"),
                        rs.getString("siteparceiro")
                );
                parceiros.add(parceiro);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os parceiros: " + e.getMessage(), e);
        }

        return parceiros;
    }*/
}
