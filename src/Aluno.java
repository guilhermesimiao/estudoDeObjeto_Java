public class Aluno {
    String nome;
    int media;
    double[] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;

    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma/ notas.length;
    }
    public boolean passou (int mediaDigitada){
        this.media = mediaDigitada;
        return calcularMedia() >= mediaDigitada;
    }
}

