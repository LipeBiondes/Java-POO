package aula12;
public class Canguru extends Mamifero{
    public void usaBolsa(){
        System.out.println("Usando bolsa.");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
