public class Cafeteira implements DispositivoInteligente {

    private boolean ligada;
    private boolean preparandoCafe;

    @Override
    public void ligar() {
        ligada = true;
        preparandoCafe = true;
    }

    @Override
    public void desligar() {
        ligada = false;
        preparandoCafe = false;
    }

    public void pararPreparo() {
        if (ligada) {
            preparandoCafe = false;
        }
    }

    @Override
    public void exibirEstado() {
        System.out.println("Cafeteira ligada: " + ligada);
        System.out.println("Preparando café: " + preparandoCafe);
    }
}