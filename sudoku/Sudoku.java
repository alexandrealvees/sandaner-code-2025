public class Sudoku {
    private Celula[][] tabuleiro;

    public Sudoku() {
        tabuleiro = new Celula[9][9];
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                tabuleiro[y][x] = new Celula(0, true);
            }
        }
    }

    public void preencherCelula(int x, int y, int valor, boolean editavel) {
        tabuleiro[y][x] = new Celula(valor, editavel);
    }

    public void imprimirTabuleiro() {
        System.out.println("┌───────┬───────┬───────┐");
        for (int y = 0; y < 9; y++) {
            System.out.print("│ ");
            for (int x = 0; x < 9; x++) {
                System.out.print(tabuleiro[y][x] + " ");
                if ((x + 1) % 3 == 0) System.out.print("│ ");
            }
            System.out.println();
            if ((y + 1) % 3 == 0 && y != 8) {
                System.out.println("├───────┼───────┼───────┤");
            }
        }
        System.out.println("└───────┴───────┴───────┘");
    }
}
