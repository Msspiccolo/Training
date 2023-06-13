import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        quantidade = sc.nextInt();

        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < quantidade; i++) {
            alunos[i] = new Aluno();

            System.out.println("Digite o nome do aluno  " + (i + 1) + ":");
            sc.nextLine();
            String nome = sc.nextLine();
            alunos[i].setNomeAluno(nome);

            System.out.println("Digite a nota do aluno " + (i + 1) + " no primeiro bimestre: ");
            float notaPrimeiroBimestre = sc.nextFloat();
            alunos[i].setNotaPrimeiroBimestre(notaPrimeiroBimestre);

            System.out.println("Digite a nota do aluno " + (i + 1) + " no segundo bimestre: ");
            float notaSegundoBimestre = sc.nextFloat();
            alunos[i].setNotaSegundoBimestre(notaSegundoBimestre);

            System.out.println("Digite a nota do aluno " + (i + 1) + " no terceiro bimestre: ");
            float notaTerceiroBimestre = sc.nextFloat();
            alunos[i].setNotaTerceiroBimestre(notaTerceiroBimestre);

            System.out.println("Digite a nota do aluno " + (i + 1) + " no quarto bimestre: ");
            float notaQuartoBimestre = sc.nextFloat();
            alunos[i].setNotaQuartoBimestre(notaQuartoBimestre);


        }

        for (int i = 0; i < quantidade; i++) {

            float media = alunos[i].calcularMedia();
            System.out.println("A média do aluno: " + alunos[i].getNomeAluno() + (i + 1) + " é: " + media);


            if (media >= 6) {
                System.out.println("Você foi aprovado !!!");
            } else {
                System.out.println("Você foi reprovado!!!");

            }
        }


    }

}


class Aluno {

    private String NomeAluno;

    public String getNomeAluno() {
        return NomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        NomeAluno = nomeAluno;
    }

    private float notaPrimeiroBimestre;
    private float notaSegundoBimestre;

    private float notaTerceiroBimestre;

    private float notaQuartoBimestre;

    public Aluno() {
    }

    public float getNotaQuartoBimestre() {
        return notaQuartoBimestre;
    }

    public void setNotaQuartoBimestre(float notaQuartoBimestre) {
        this.notaQuartoBimestre = notaQuartoBimestre;
    }

    public float getNotaTerceiroBimestre() {
        return notaTerceiroBimestre;
    }

    public void setNotaTerceiroBimestre(float notaTerceiroBimestre) {
        this.notaTerceiroBimestre = notaTerceiroBimestre;
    }

    public float getNotaPrimeiroBimestre() {
        return notaPrimeiroBimestre;
    }

    public void setNotaPrimeiroBimestre(float notaPrimeiroBimestre) {
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
    }

    public float getNotaSegundoBimestre() {
        return notaSegundoBimestre;
    }

    public void setNotaSegundoBimestre(float notaSegundoBimestre) {
        this.notaSegundoBimestre = notaSegundoBimestre;
    }


    public float calcularMedia() {
        return (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;
    }
}
