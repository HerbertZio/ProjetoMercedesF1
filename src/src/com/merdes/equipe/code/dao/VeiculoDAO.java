package src.com.merdes.equipe.code.dao;

import com.merdes.equipe.code.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeiculoDAO {

    public static void inserirVeiculo(Veiculo veiculo) {
        String sql = "INSERT INTO Veiculo (numero, modelo) VALUES (?, ?)";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, veiculo.getNumero());
            pstmt.setString(2, veiculo.getModelo());

            pstmt.executeUpdate();
            System.out.println("Veículo inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}