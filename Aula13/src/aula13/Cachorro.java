/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author Alefe Filipe
 */
public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom(){
        System.out.println("Au, au, au, au.");
    }
    
    public void reagir(String frase){
        if ("oi".equals(frase) || "pega comida".equals(frase)) {
            System.out.println("Abanei o rabo e lati.");
        } else {
            System.out.println("rsnnnnnnnn.");
        }
    }
    public void reagir(int hora, int min){
        if (hora<12) {
            System.out.println("Abanei o rabo.");
        } else if(hora>=18) {
            System.out.println("Estou lhe ignorando.");
        } else{
            System.out.println("Abanei e lati.");
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanei o rabo.");
        } else {
            System.out.println("Rsnnnnnnsn.");
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("abanei o rabo.");
            } else{
                System.out.println("Lati.");
            }
        } else{
            if (peso<10){
                System.out.println("rosnei.");
            } else{
                System.out.println("Ignorei.");
            }
        }
    }
}
