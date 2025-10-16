public class Aluno {
    private String nome;
    private double n1;
    private double n2;
    private double n3;

    public Aluno(String nome, double n1, double n2, double n3) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
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

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getMedia() {
        return (n1 + n2 + n3) / 3;
    }

    public String getSituacao() {
        double media = getMedia();
        if (media >= 7) return "Aprovado";
        else if (media >= 5) return "Recuperação";
        else return "Reprovado";
    }

    public String toString() {
        return nome + " - Média: " + getMedia() + " - " + getSituacao();
    }
}
