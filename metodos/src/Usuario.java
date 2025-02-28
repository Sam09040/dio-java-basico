public class Usuario {
    public static void main(String[] args) {
        SmartTv minhaTv = new SmartTv();
        System.out.println("A tv está ligada? : " + minhaTv.ligada);
        System.out.println("O canal é: " + minhaTv.canal);
        System.out.println("O volume é: " + minhaTv.volume);

        minhaTv.diminuirVolume();
        
        minhaTv.ligar();
        System.out.println("A tv está ligada? " + minhaTv.ligada);

        for (int i = 0; i < 5; i++) {
            minhaTv.diminuirVolume();
        }
        System.out.println("O volume agora é: " + minhaTv.volume);

        minhaTv.mudarCanal(540);
    }
}
