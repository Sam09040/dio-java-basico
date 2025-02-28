import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Fui executado pelo terminal!");
        Scanner scanner = new Scanner(System.in);

        /* 
        String nome = args[0];
        String sobrenome = args[1];
        String aula = args[2]; 
        */

        System.out.println("Qual o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = scanner.next();

        System.out.println("Que dia é hoje?");
        int dia = scanner.nextInt();
        
        System.out.println("Qual a aula que você vai assistir?");
        String aula = scanner.next();

        System.out.printf("Olá, %s %s! Hoje é %d de fevereiro! Vamos à aula de %s.\n", nome, sobrenome, dia, aula);
        scanner.close();
    }
}
