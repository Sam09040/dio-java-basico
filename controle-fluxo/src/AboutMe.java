import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a sua altura");
        double altura = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Ola, me chamo " + nome.toLowerCase() + " " + sobrenome.toLowerCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura + " cm");
        scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Os campos idade e altura devem ser numéricos. No campo altura, utilize de '.' ao invés de ','");
        }
    }
}
