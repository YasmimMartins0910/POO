public class Main {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        Ventilador ventilador = new Ventilador();
        Cafeteira cafeteira = new Cafeteira();

        lampada.ligar();
        lampada.ajustarIntensidade(70);
        lampada.exibirEstado();

        ventilador.ligar();
        ventilador.aumentarVelocidade();
        ventilador.exibirEstado();

        cafeteira.ligar();
        cafeteira.exibirEstado();
        cafeteira.pararPreparo();
        cafeteira.exibirEstado();
    }
}