package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Informatica");
        a1.setMatricula(12546);
        a1.pagarMens();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(321523);
        b1.setNome("Jubileu");
        b1.setBolsa(100f);
        b1.setSexo("M");
        b1.pagarMens();
    }
}
