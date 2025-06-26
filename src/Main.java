import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digite o nome do aluno: ");
            String nome = scan.next();

        System.out.println("Escreva a média manualmente: ");
            int media = scan.nextInt();

        System.out.println("Escreva a quantidade de notas manualmente: ");
            int quantidadeNotas = scan.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++){
            System.out.println("Digite a " + (i+1) + "° nota");
                notas[i] = scan.nextDouble();
        }

        Aluno aluno = new Aluno(nome, notas);

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());

        if (aluno.passou(media)){
            System.out.println("Aluno aprovado!");
        }else {
            System.out.println("Aluno reprovado!");
        }
    }
}