package br.com.dio.ui;

import br.com.dio.persistence.entity.BoardColumnEntity;
import br.com.dio.persistence.entity.BoardColumnKindEnum;
import br.com.dio.persistence.entity.BoardEntity;
import br.com.dio.service.BoardQueryService;
import br.com.dio.service.BoardService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.dio.persistence.config.ConnectionConfig.getConnection;
import static br.com.dio.persistence.entity.BoardColumnKindEnum.*;

public class MainMenu {

    private final Scanner scanner = new Scanner(System.in);

    public void execute() throws SQLException {
        System.out.println("Bem vindo ao gerenciador de boards, escolha a opção desejada");
        while (true) {
            System.out.println("1 - Criar um novo board");
            System.out.println("2 - Selecionar um board existente");
            System.out.println("3 - Excluir um board");
            System.out.println("4 - Sair");

            int option = getIntInput("Opção: ");
            switch (option) {
                case 1 -> createBoard();
                case 2 -> selectBoard();
                case 3 -> deleteBoard();
                case 4 -> System.exit(0);
                default -> System.out.println("Opção inválida, informe uma opção do menu");
            }
        }
    }

    private void createBoard() throws SQLException {
        var entity = new BoardEntity();
        System.out.println("Informe o nome do seu board:");
        entity.setName(scanner.nextLine());

        int additionalColumns = getIntInput("Seu board terá colunas além das 3 padrões? Se sim informe quantas, senão digite '0': ");

        List<BoardColumnEntity> columns = new ArrayList<>();

        System.out.println("Informe o nome da coluna inicial do board:");
        var initialColumnName = scanner.nextLine();
        columns.add(createColumn(initialColumnName, INITIAL, 0));

        for (int i = 0; i < additionalColumns; i++) {
            System.out.printf("Informe o nome da coluna de tarefa pendente %d do board:%n", i + 1);
            var pendingColumnName = scanner.nextLine();
            columns.add(createColumn(pendingColumnName, PENDING, i + 1));
        }

        System.out.println("Informe o nome da coluna final:");
        var finalColumnName = scanner.nextLine();
        columns.add(createColumn(finalColumnName, FINAL, additionalColumns + 1));

        System.out.println("Informe o nome da coluna de cancelamento do board:");
        var cancelColumnName = scanner.nextLine();
        columns.add(createColumn(cancelColumnName, CANCEL, additionalColumns + 2));

        entity.setBoardColumns(columns);

        try (var connection = getConnection()) {
            var service = new BoardService(connection);
            service.insert(entity);
        }
    }

    private void selectBoard() throws SQLException {
        long id = getLongInput("Informe o id do board que deseja selecionar: ");
        try (var connection = getConnection()) {
            var queryService = new BoardQueryService(connection);
            var optional = queryService.findById(id);
            optional.ifPresentOrElse(
                    b -> new BoardMenu(b).execute(),
                    () -> System.out.printf("Não foi encontrado um board com id %d%n", id)
            );
        }
    }

    private void deleteBoard() throws SQLException {
        long id = getLongInput("Informe o id do board que será excluído: ");
        try (var connection = getConnection()) {
            var service = new BoardService(connection);
            if (service.delete(id)) {
                System.out.printf("O board %d foi excluído%n", id);
            } else {
                System.out.printf("Não foi encontrado um board com id %d%n", id);
            }
        }
    }

    private BoardColumnEntity createColumn(final String name, final BoardColumnKindEnum kind, final int order) {
        var boardColumn = new BoardColumnEntity();
        boardColumn.setName(name);
        boardColumn.setKind(kind);
        boardColumn.setOrder(order);
        return boardColumn;
    }

    // Utilitários seguros de leitura
    private int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private long getLongInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Long.parseLong(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
    }
}
