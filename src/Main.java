import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int quantidade = sc.nextInt(); // eu gosto de códigos mais reduzidos então optei por fazer a declaração da variável já com o valor.

        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < quantidade; i++) {
            alunos[i] = new Aluno();

            //Nesses casos no qual você cria uma nova variável, para ser utilizada apenas na próxima linha
            //pode ser resumido simplesmente passando "sc.nextLine()" nos parâmetros dos setters

            System.out.println("Digite o nome do aluno  " + (i + 1) + ":");
            sc.nextLine();
            alunos[i].setNomeAluno(sc.nextLine());

            //Assim reduzira seu código.

            System.out.println("Digite a nota do aluno " + (i + 1) + " no primeiro bimestre: ");
            alunos[i].setNotaPrimeiroBimestre(sc.nextFloat());

            System.out.println("Digite a nota do aluno " + (i + 1) + " no segundo bimestre: ");
            alunos[i].setNotaSegundoBimestre(sc.nextFloat());

            System.out.println("Digite a nota do aluno " + (i + 1) + " no terceiro bimestre: ");
            alunos[i].setNotaTerceiroBimestre(sc.nextFloat());

            System.out.println("Digite a nota do aluno " + (i + 1) + " no quarto bimestre: ");
            alunos[i].setNotaQuartoBimestre(sc.nextFloat());
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

//Dê preferencias por fazer classes em seus arquivos proprios, fica mais facil a leitura do código em grande escala


//Só lembrando essas mudanças são mais voltadas a boas práticas e organização de código, a sua lógica está correta e não tem oque mudar diante a isso :)
