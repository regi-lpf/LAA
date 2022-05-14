public class Aluno {
    private int matricula;
    private String nome;
    private double n1;
    private double n2;
    private double trabalho;

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public double getMedia() {
        double soma = (n1*3 + n2*3 + trabalho*2);
        return soma/8;
    }

    public String getSituacao() {
        if (getMedia()<4){
            return "Reprovado";
        }
        else if (getMedia()<6){
            return "Recuperação";
        }
        else {
            return "Aprovado";
        }
    }
}
