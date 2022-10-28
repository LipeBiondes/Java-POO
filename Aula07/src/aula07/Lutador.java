package aula07;
public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria ;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //Métodos
    public void apresentar(){
        System.out.println("Nome do Lutador: "+this.getNome()+".");
        System.out.println("Origem do Lutador: "+this.getNacionalidade()+".");
        System.out.println("Idade do Lutador: "+this.getIdade()+".");
        System.out.println("Altura do Lutador: "+this.getAltura()+"m.");
        System.out.println("Peso do Lutador: "+this.getPeso()+"Kg.");
        System.out.println("Ganhou "+this.getVitorias()+" vezes.");
        System.out.println("Perdeu "+this.getDerrotas()+" veses.");
        System.out.println("Empatou "+this.getEmpates()+" vezes.");
    }
    public void status(){
        System.out.println(this.getNome()+" e um peso: "+this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias()); 
        System.out.println("Derrotas: "+this.getDerrotas()); 
        System.out.println("Empates: "+this.getEmpates()); 
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    //Métodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, 
                    int em) {
        nome = no;
        nacionalidade = na;
        idade = id;
        vitorias = vi;
        derrotas = de;
        empates = em;
        altura = al;
        this.setPeso(pe);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
    
    
}
