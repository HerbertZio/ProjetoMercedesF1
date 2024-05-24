package src.com.merdes.equipe.code.dao;

import com.merdes.equipe.code.Equipe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EquipeDAO {

    public static void inserirEquipe(Equipe equipe) {
        String sql = "INSERT INTO Equipe (nome, idade, nacionalidade, salario) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, equipe.getNome());
            pstmt.setInt(2, equipe.getIdade());
            pstmt.setString(3, equipe.getNacionalidade());
            pstmt.setDouble(4, equipe.getSalario());
            pstmt.executeUpdate();
            System.out.println("Equipe inserida com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}