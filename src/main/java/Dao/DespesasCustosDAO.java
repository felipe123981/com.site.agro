/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Classificacao;
import util.PostgresConnection;

public class DespesasCustosDAO {
/*
    // Método para criar uma nova despesa/custo no banco de dados
    public void create(DespesasCustos despesaCusto) throws SQLException {
        String sql = "INSERT INTO despesa_custo (despesascusto, unidadedespesascustos, valordespesascustos, tipodespesascustos) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, despesaCusto.getDespesascusto());
            stmt.setString(2, despesaCusto.getUnidadedespesascustos());
            stmt.setBigDecimal(3, BigDecimal.valueOf(despesaCusto.getValordespesascustos()));
            stmt.setString(4, despesaCusto.getTipodespesascustos());

            stmt.executeUpdate();
        }
    }

    // Método para ler uma despesa/custo do banco de dados pelo id
    public DespesasCustos read(int id) throws SQLException {
        String sql = "SELECT * FROM despesa_custo WHERE iddespesascusto = ?";
        DespesasCustos despesaCusto = null;

        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                despesaCusto = new DespesasCustos();
                despesaCusto.setIddespesascusto(rs.getInt("iddespesascusto"));
                despesaCusto.setDespesascusto(rs.getString("despesascusto"));
                despesaCusto.setUnidadedespesascustos(rs.getString("unidadedespesascustos"));
                despesaCusto.setValordespesascustos(rs.getBigDecimal("valordespesascustos").doubleValue());
                despesaCusto.setTipodespesascustos(rs.getString("tipodespesascustos"));
            }
        }

        return despesaCusto;
    }

    // Método para atualizar uma despesa/custo no banco de dados
    public void update(DespesasCustos despesaCusto) throws SQLException {
        String sql = "UPDATE despesa_custo SET despesascusto = ?, unidadedespesascustos = ?, valordespesascustos = ?, tipodespesascustos = ? WHERE iddespesascusto = ?";

        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, despesaCusto.getDespesascusto());
            stmt.setString(2, despesaCusto.getUnidadedespesascustos());
            stmt.setBigDecimal(3, BigDecimal.valueOf(despesaCusto.getValordespesascustos()));
            stmt.setString(4, despesaCusto.getTipodespesascustos());
            stmt.setInt(5, despesaCusto.getIddespesascusto());

            stmt.executeUpdate();
        }
    }

    // Método para deletar uma despesa/custo do banco de dados
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM despesa_custo WHERE iddespesascusto = ?";

        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    // Método para listar todas as despesas/custos do banco de dados
    public List<DespesasCustos> listAll() throws SQLException {
        String sql = "SELECT * FROM despesa_custo";
        List<DespesasCustos> despesasCustosList = new ArrayList<>();

        try (Connection conn = PostgresConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                DespesasCustos despesaCusto = new DespesasCustos();
                despesaCusto.setIddespesascusto(rs.getInt("iddespesascusto"));
                despesaCusto.setDespesascusto(rs.getString("despesascusto"));
                despesaCusto.setUnidadedespesascustos(rs.getString("unidadedespesascustos"));
                despesaCusto.setValordespesascustos(rs.getBigDecimal("valordespesascustos").doubleValue());
                despesaCusto.setTipodespesascustos(rs.getString("tipodespesascustos"));

                despesasCustosList.add(despesaCusto);
            }
        }

        return despesasCustosList;
    }*/
}

