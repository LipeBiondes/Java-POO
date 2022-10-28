package aula12;
public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

        public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Quantidade de membros: "+this.getMembros());
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero.");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo.");
    }
}
