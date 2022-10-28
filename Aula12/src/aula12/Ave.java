package aula12;
public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho.");
    }
    
    public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Quantidade de membros: "+this.getMembros());
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da ave.");
    }
}
