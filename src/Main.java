import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] notas = new double[3];

        System.out.println("digite o nome do aluno: ");
            String nome = scan.next();

        for (int i = 0; i < 3; i++){
            System.out.println("Digite a " + (i+1) + "° nota");
                notas[i] = scan.nextDouble();
        }

        Aluno aluno = new Aluno(nome, notas[0], notas[1], notas[2]);

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());

        if (aluno.passou()){
            System.out.println("Aluno aprovado!");
        }else {
            System.out.println("Aluno reprovado!");
        }
    }
}