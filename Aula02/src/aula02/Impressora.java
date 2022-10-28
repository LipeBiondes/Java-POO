/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author Alefe Filipe
 */
public class Impressora {
    boolean caboEnergia;
    boolean caboUSB;
    boolean scanner;
    boolean papel;
    boolean botao;
    String corCartucho;
    Float visor;
    String modelo;
    String cor;
    
    void status(){
        System.out.println("Modelo da impressora:" + modelo);
        System.out.println("Tamanho do visor: "+ visor);
        System.out.println("Cor da impressora: "+ cor);
        System.out.println("Cor do cartucho: "+ corCartucho);
    }
    
    void ligar(){
        if (this.caboEnergia == true) {
            System.out.println("Ligando...");
        }else {
            System.out.println("Cabo de energia desconectado, impossivel ligar!");
        }
    }
    
    void desligar(){
        if (this.botao == true) {
            System.out.println("Desligando...");
        }else{
            System.out.println("Precione o botao para desligar.");
        }
    }
    
    void scanear(){
        if (this.scanner == true) {
            System.out.println("Escaneando...");
        }else{
            System.out.println("Escaner desligado, impossivel escanear");
        }
    }
    
    void imprimir(){
        if (this.papel == true) {
            System.out.println("Imprimindo...");
        }else{
            System.out.println("Erro, papel para impressao nao alocado!");
        }
    }
    
}
