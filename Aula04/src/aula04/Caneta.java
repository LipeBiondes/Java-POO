package aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampado;

    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    public void tampar(){
        this.tampado = true;
    }
    public void destampar(){
        this.tampado = false;
    }
    
    public void status(){
        System.out.println("--Status da Caneta--");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.print("Tampada: ");
        if (tampado) {
            System.out.println("Esta tampada.");
        }
        else{
            System.out.println("Esta destampada.");
        }
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampado() {
        return tampado;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }
    
}
