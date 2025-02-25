

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;
        float aumento = 250.50F; //para o uso de float ou long, é necessário ter um F ou L, respectivamente.

        short numero = 1;
        int numero1 = numero;
        short numero2 = (short) numero1; //neste caso será necessário um casting pois sai de um tipo mais abrangente para um tipo mais específico.

        final double VALOR_DE_PI = 3.14; //quando uma variável é constante, ou seja, seu valor não muda, é necessário utilizar o final antes do tipo da variável e o nome dela é escrito em caixa alta.
        System.out.println("Salario minimo: " + salarioMinimo + "\nAumento: " + aumento + "\nNumero: " + numero2 + "\nValor de pi: " + VALOR_DE_PI);
    }
}
