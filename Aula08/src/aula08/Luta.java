package aula08;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2 ){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
            System.out.println("Luta marcada entre: "+ this.desafiado.getNome() +" e "+ this.desafiante.getNome()+".");
        } else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
        
         Random aleatorio = new Random();
         rounds = aleatorio.nextInt(7);
    }
    
    public void posLuta(){
        System.out.println("------ Resultado da Luta ------");
        this.getDesafiado().status();
        this.getDesafiante().status();
    }
    
    public void lutar(){
        if (this.isAprovada()) {
            System.out.println("Luta com: "+ this.getRounds()+" rounds.");
            System.out.println("----Desafiado----");
            this.getDesafiado().apresentar();
            System.out.println("----Desafiante----");
            this.desafiante.apresentar();
            System.out.println("------------------");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0 -> {
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("Desafiado "+ this.desafiado.getNome()+" venceu a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("Desafiante "+ this.desafiante.getNome()+" venceu a luta!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
            }
        } else{
            System.out.println("A luta nao pode acontecer.");
        }
    }
    
    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
