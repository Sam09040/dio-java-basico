public class FormatadorCepExemplo {
    public static void main(String[] args) {
        String cep = "41650195";
        try {
            System.out.println(formatarCep(cep));
        } catch (CepInvalidoException e) {
            System.out.println("O tamanho do cep está inválido");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }
}
