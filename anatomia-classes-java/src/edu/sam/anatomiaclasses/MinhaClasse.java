package edu.sam.anatomiaclasses;

public class MinhaClasse {
    // arquivo deve começar com letra maiúscula e a classe deve ter o mesmo nome

    /*
     * para declarar um método, é necessário utilizar a seguinte estrutura: 
     * tipoRetorno nomeObjetivoNoInfinitivo Parametro(s)
     * também é possível utilizar modificador de acesso
     */
    public static void main(String[] args) {
        /* 
        variáveis devem utilizar o padrão camelCase, onde a primeira palavra começa com letra minúscula e as próximas começam com letra maiúscula 
        */
        /* 
        para declarar uma variável, a estrutura é a seguinte:
        tipo nomeVariavel = valorInicial; (opcional em alguns casos)
        */
        String primeiroNome = "Sam";
        String segundoNome = "de Almeida";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
