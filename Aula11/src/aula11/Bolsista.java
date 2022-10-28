package aula11;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        if (bolsa == 1000) {
            System.out.println("Nao foi possivel renovar bolsa");
        }else{
            System.out.println("Renovando bolsa de: " +this.getNome());
            this.bolsa = 1000;
            System.out.println("Bolsa renovada com sucesso!");
        }
    }

    @Override
    public void pagarMens(){
        if (bolsa == 0) {
            System.out.println("Dinheiro insuficiente para pagar mensalidade, renovando bolsa...");
        }else{
            this.bolsa = 0;
            System.out.println("Mensalidade do aluno bolsista: "+this.getNome() +", paga com sucesso!");
        }
    }
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
