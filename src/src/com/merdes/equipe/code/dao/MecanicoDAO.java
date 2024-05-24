package src.com.merdes.equipe.code.dao;

import com.merdes.equipe.code.Mecanico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MecanicoDAO {

    public static void inserirMecanico(Mecanico mecanico) {
        String sql = "INSERT INTO Mecanico (nome, idade, nacionalidade, salario," +
                "especialidade, anos_experiencia) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, mecanico.getNome());
            pstmt.setInt(2, mecanico.getIdade());
            pstmt.setString(3, mecanico.getNacionalidade());
            pstmt.setDouble(4, mecanico.getSalario());
            pstmt.setString(5, mecanico.getEspecialidade());
            pstmt.setInt(6, mecanico.getAnosExperiencia());
            pstmt.executeUpdate();
            System.out.println("Mecânico inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}