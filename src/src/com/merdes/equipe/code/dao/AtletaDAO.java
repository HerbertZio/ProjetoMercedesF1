package src.com.merdes.equipe.code.dao;

import com.merdes.equipe.code.Atleta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtletaDAO {

    public static void inserirAtleta(Atleta atleta) {
        String sql = "INSERT INTO Atleta (nome, idade, nacionalidade, salario, altura, peso, vitorias, titulos, veiculo_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, atleta.getNome());
            pstmt.setInt(2, atleta.getIdade());
            pstmt.setString(3, atleta.getNacionalidade());
            pstmt.setDouble(4, atleta.getSalario());
            pstmt.setDouble(5, atleta.getAltura());
            pstmt.setDouble(6, atleta.getPeso());
            pstmt.setInt(7, atleta.getVitorias());
            pstmt.setInt(8, atleta.getTitulos());
            pstmt.setInt(9, atleta.getVeiculo() != null? atleta.getVeiculo().getId() : null);
            pstmt.executeUpdate();
            System.out.println("Atleta inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}