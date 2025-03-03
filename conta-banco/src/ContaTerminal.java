import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco da DIO!");
        System.out.println("Por favor, digite o número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular da conta: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da conta: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");

        scanner.close();
    }
}
