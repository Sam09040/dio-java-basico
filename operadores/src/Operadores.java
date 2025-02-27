public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        numero = - numero; //torna o número em negativo
        System.out.println(numero);
        numero = numero * -1; //torna o número em positivo novamente
        System.out.println(numero);
        numero = numero + 2; //incrementa o número
        System.out.println(numero);
        numero++; //incrementa o número em um
        //numero = numero + 1;
        System.out.println(numero);
        numero--; //decrementa o número em um
        //numero = numero - 1;
        System.out.println(numero);

        //operador ternário
        String resultado = numero == 7 ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //operadores lógicos são && (AND) e || (OR)
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultadoLogico = verdadeiro && falso; //false
        System.out.println(resultadoLogico);
        
        resultadoLogico = verdadeiro || falso; //true
        System.out.println(resultadoLogico); 
    }
}
