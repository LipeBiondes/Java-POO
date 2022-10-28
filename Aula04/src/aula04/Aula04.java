package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Vermelha", 0.8f);
        c1.destampar();
        c1.status();        
        Caneta c2 = new Caneta("Valencia", "Azul", 1.2f);
        c2.status();
    }
    
}
