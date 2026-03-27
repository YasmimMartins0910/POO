public class Ventilador implements DispositivoInteligente {

    private boolean ligado;
    private int velocidade;

    @Override
    public void ligar() {
        ligado = true;
        velocidade = 1;
    }

    @Override
    public void desligar() {
        ligado = false;
        velocidade = 0;
    }

    public void aumentarVelocidade() {
        if (ligado && velocidade < 3) {
            velocidade++;
        }
    }

    public void diminuirVelocidade() {
        if (ligado && velocidade > 1) {
            velocidade--;
        }
    }

    @Override
    public void exibirEstado() {
        System.out.println("Ventilador ligado: " + ligado);
        System.out.println("Velocidade: " + velocidade);
    }
}