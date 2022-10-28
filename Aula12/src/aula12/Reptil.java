package aula12;
public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

        public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Quantidade de membros: "+this.getMembros());
    }
    
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do reptil.");
    }
}
