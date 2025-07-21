package br.com.dio;

import br.com.dio.persistence.migration.MigrationStrategy;
import br.com.dio.ui.MainMenu;

import java.sql.SQLException;

import static br.com.dio.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try (var connection = getConnection()) {
            // Executa migração de banco sempre
            new MigrationStrategy(connection).executeMigration();
        }

        // Se nenhum argumento ou "menu", inicia menu interativo
        if (args.length == 0 || args[0].equalsIgnoreCase("menu")) {
            new MainMenu().execute();
        } else if (args[0].equalsIgnoreCase("migrate")) {
            System.out.println("Migração executada com sucesso. Encerrando...");
        } else {
            System.out.println("Argumento inválido. Use: 'menu' ou 'migrate'");
        }
    }
}
