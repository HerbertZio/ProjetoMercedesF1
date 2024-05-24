package src.com.merdes.equipe.code;

import com.merdes.equipe.code.dao.*;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            if (connection != null) {
                System.out.println();
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("------------------");

        Veiculo veiculo1 = new Veiculo(
                1,
                5150,
                "Impala"
        );

        Veiculo veiculo2 = new Veiculo(
                2,
                5155,
                "Maverick"
        );

        Veiculo veiculo3 = new Veiculo(
                3,
                7070,
                "Opala");

//        VeiculoDAO.inserirVeiculo(veiculo1);
//        VeiculoDAO.inserirVeiculo(veiculo2);
//        VeiculoDAO.inserirVeiculo(veiculo3);

        Atleta atleta1 = new Atleta(
                0,
                "Fulano",
                35,
                "Brasileiro",
                50_000.00,
                1.85,
                100.0,
                10,
                5,
                veiculo1
        );

        Atleta atleta2 = new Atleta(
                0,
                "Sicrano",
                35,
                "Brasileira",
                60_000.00,
                1.85,
                100.0,
                12,
                7,
                veiculo2
        );

        Atleta atleta3 = new Atleta(
                0,
                "Beltrano",
                35,
                "Brasileiro",
                80_000.00,
                1.85,
                100.0,
                15,
                8,
                veiculo3
        );

//        AtletaDAO.inserirAtleta(atleta1);
//        AtletaDAO.inserirAtleta(atleta2);
//        AtletaDAO.inserirAtleta(atleta3);

        Equipe equipe1 = new Equipe(
                0,
                "Equipe A",
                10,
                "Brasil",
                50_000.00
        );

        Equipe equipe2 = new Equipe(
                0,
                "Equipe B",
                12,
                "EUA",
                60_000.00
        );

//        EquipeDAO.inserirEquipe(equipe1);
//        EquipeDAO.inserirEquipe(equipe2);

        Mecanico mecanico1 = new Mecanico(
                0,
                "Carlão",
                70,
                "Brasileiro",
                60_000.00,
                "Motor",
                50
        );

        Mecanico mecanico2 = new Mecanico(
                0,
                "Zelão",
                65,
                "Brasileiro",
                45_000.00,
                "Suspensão",
                7
        );

//        MecanicoDAO.inserirMecanico(mecanico1);
//        MecanicoDAO.inserirMecanico(mecanico2);

        Circuito circuito1 = new Circuito(
                0,
                "Circuito A",
                "Brasil",
                123
        );

        Circuito circuito2 = new Circuito(
                0,
                "Circuito B",
                "EUA",
                456
        );

        CircuitoDAO.inserirCircuito(circuito1);
        CircuitoDAO.inserirCircuito(circuito2);

    }
}