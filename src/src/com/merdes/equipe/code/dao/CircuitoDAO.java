package src.com.merdes.equipe.code.dao;

import com.merdes.equipe.code.Circuito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CircuitoDAO {

    public static void inserirCircuito(Circuito circuito) {
        String sql = "INSERT INTO Circuito (nome, pais, record) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, circuito.getNome());
            pstmt.setString(2, circuito.getPais());
            pstmt.setInt(3, circuito.getRecord());
            pstmt.executeUpdate();
            System.out.println("Circuito inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}