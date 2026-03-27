public class Lampada implements DispositivoInteligente {
    private boolean ligada;
    private int intensidade;

    public void ligar() {
        ligada = true;
        intensidade = 100;
    }

    public void desligar (){
        ligada = false;
        intensidade = 0;
    }
    public void ajustarIntensidade(int valor) {
        if (ligada && valor >= 0 && valor <= 100){
            intensidade = valor;
        }
    }
    public void exibirEstado() {
        System.out.println("Lâmpada Ligada: " + ligada);
        System.out.println("intensidade: " + intensidade);
    }
}
