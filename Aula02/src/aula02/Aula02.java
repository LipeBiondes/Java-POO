package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Impressora ip1 = new Impressora();
        ip1.cor = "Vermelha";
        ip1.caboEnergia = true;
        ip1.modelo = "Hp series 2000";
        ip1.papel = true;
        ip1.scanner = true;
        ip1.status();
        ip1.ligar();
        ip1.scanear();
        ip1.imprimir();
        ip1.desligar();
        
        Caneta c1 = new Caneta();
        c1.modelo = "Bronhosa";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "brocazil";
        c2.cor = "Vermelha";
        c2.ponta = 1.3f;
        c2.carga = 100;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
