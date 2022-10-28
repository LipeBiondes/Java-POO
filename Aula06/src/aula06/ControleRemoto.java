package aula06;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volumeAtual;
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean mutado;
    
    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.volumeAtual = 50;
        this.ligado = false;
        this.tocando = false;
        this.mutado = false;
    }

    public boolean isMutado() {
        return mutado;
    }

    public void setMutado(boolean mutado) {
        this.mutado = mutado;
    }
    
    
    
    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenur() {
        System.out.println("");
        if (this.isLigado()) {
            System.out.println("------MENU------");
        System.out.print("Esta ligado: ");
        if (this.isLigado()) {
            System.out.println("Ligado.");
        }else{
            System.out.println("Desligado.");
        }
        System.out.print("Esta tocando: ");
        if (this.isTocando()) {
            System.out.println("Tocando.");
        } else {
            System.out.println("Pausado.");
        }
        System.out.print("Volume: " + this.getVolume() +". ");
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
        }    
        } else {
            System.out.println("ligue o aparelho para mostrar o menu.");
        }      
    }

    @Override
    public void fecharMenur() {
        System.out.println("");
        System.out.println("Fechando menu...");
        System.out.println("----------------");
    }

    @Override
    public void maisVolume() {
        if (this.mutado) {
            this.setVolume(this.getVolumeAtual());
        }
        if (this.isLigado()) {
            this.setVolume(this.getVolume()+5);
            this.setVolumeAtual(this.getVolumeAtual()+5);
        }else{
            System.out.println("Impossivel aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.mutado) {
            this.setVolume(this.getVolumeAtual());
        }
        if (this.isLigado() && this.volume >= 5) {
            this.setVolume(this.getVolume()-5);
            this.setVolumeAtual(this.getVolumeAtual()-5);
        }else{
            System.out.println("Impossivel diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        int v = this.getVolume();
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            this.setVolumeAtual(v);
            this.setMutado(true);
        } else{
            System.out.println("Impossivel ligar mudo.");
        }
    }

    @Override
    public void desligarMudo() {
        int v = this.getVolumeAtual();
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(v);
            this.setMutado(false);
        } else{
            System.out.println("Impossivel desmutar.");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        } else{
            System.out.println("Nao consegui dar play.");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else{
            System.out.println("nao consegui pausar.");
        }
    }  
}
