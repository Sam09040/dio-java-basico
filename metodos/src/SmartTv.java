public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Ligando a tv");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando a tv");
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Aumentando o volume para " + volume);
        } else if (!ligada) {
            System.out.println("Ligue a tv");
        } else {
            System.out.println("Volume já está no máximo");
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Diminuindo o volume para " + volume);
        } else if (!ligada) {
            System.out.println("Ligue a tv");
        } else {
            System.out.println("Volume já está no mínimo");
        }
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Agora você está no canal " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Agora você está no canal " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Agora você está no canal " + canal);
    }
}
