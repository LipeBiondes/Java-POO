package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Canguru can = new Canguru();
        Tartaruga tar = new Tartaruga();
        
        can.setCorPelo("Marrom claro");
        can.setNome("Canguru");
        can.setIdade(2);
        can.setPeso(67.4f);
        can.setMembros(4);
        can.status();
        can.locomover();
        
        tar.setCorEscama("Casco verde");
        tar.setNome("Tartaruga");
        tar.setIdade(20);
        tar.setPeso(100.4f);
        tar.setMembros(5);
        tar.status();
        tar.locomover();
    }
}
