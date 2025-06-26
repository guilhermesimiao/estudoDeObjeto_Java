public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    int media;

    public Aluno(String nome,double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    public double calcularMedia (){
        return (nota1 + nota2 + nota3) / 3;
    }


    public boolean passou (int mediaDigitada){
        this.media = mediaDigitada;
        return calcularMedia() >= mediaDigitada;
    }
}

