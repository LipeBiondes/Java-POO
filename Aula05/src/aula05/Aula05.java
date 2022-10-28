package aula05;

public class Aula05 {    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(01);
        p1.setDonoConta("Jubileu");
        p1.abrirConta("Conta Corrente");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(02);
        p2.setDonoConta("Creuza");
        p2.abrirConta("Conta Poupanca");
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        p1.pagarMensal();
        p2.pagarMensal();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }    
}
