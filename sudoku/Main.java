public class Main {
    public static void main(String[] args) {
        Sudoku jogo = new Sudoku();

        for (String arg : args) {
            try {
                // Exemplo: "0,0;4,false"
                String[] partes = arg.split(";");
                if (partes.length != 2) {
                    throw new IllegalArgumentException("Argumento mal formatado: " + arg);
                }

                String[] coordenadas = partes[0].split(",");
                if (coordenadas.length != 2) {
                    throw new IllegalArgumentException("Coordenadas inválidas: " + partes[0]);
                }

                int x = Integer.parseInt(coordenadas[0]);
                int y = Integer.parseInt(coordenadas[1]);

                String[] valorEEditavel = partes[1].split(",");
                if (valorEEditavel.length != 2) {
                    throw new IllegalArgumentException("Valor e editável inválidos: " + partes[1]);
                }

                int valor = Integer.parseInt(valorEEditavel[0]);
                boolean editavel = Boolean.parseBoolean(valorEEditavel[1]);

                jogo.preencherCelula(x, y, valor, editavel);
            } catch (Exception e) {
                System.out.println("Erro ao processar argumento: " + arg);
                e.printStackTrace(); // pode remover depois de confirmar
            }
        }

        jogo.imprimirTabuleiro();
    }
}
