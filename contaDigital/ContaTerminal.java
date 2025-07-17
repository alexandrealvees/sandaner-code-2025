package contaDigital;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

       
        System.out.println("\n==========================================");
        System.out.printf("%-15s: %s\n", "Nome do Cliente", nomeCliente);
        System.out.printf("%-15s: %s\n", "Agência", agencia);
        System.out.printf("%-15s: %d\n", "Conta", numero);
        System.out.printf("%-15s: R$ %.2f\n", "Saldo", saldo);
        System.out.println("==========================================\n");

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%n", nomeCliente);

        scanner.close();
    }
}
