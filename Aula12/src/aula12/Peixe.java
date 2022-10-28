package aula12;
public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    public void soltarBolha(){
        System.out.println("Soltei uma bolha.");
    }

        public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Quantidade de membros: "+this.getMembros());
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite som.");
    }
}
