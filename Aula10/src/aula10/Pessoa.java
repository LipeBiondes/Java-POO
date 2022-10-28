package aula10;
public class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade;
    
    //Método
    public void fazerAniver(){
        this.setIdade(idade++);
    }
    
    //Métodos especiais
      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", sexo: " + sexo + ", idade: " + idade + '}';
    }
    
    
    
}
