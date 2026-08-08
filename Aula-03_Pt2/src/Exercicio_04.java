import java.util.Scanner;

public class Exercicio_04
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int alunos;

        System.out.print("Entre com o número de alunos matriculados na disciplina: ");
        alunos=entrada.nextInt();

        switch(alunos)
        {
            case 10:
                System.out.println("O curso sera ministrado na sala I-16.");
                break;
            case 20:
                System.out.println("O curso sera ministrado na sala I-16.");
                break;
            case 30:
                System.out.println("O curso sera ministrado na sala I-22.");
                break;
            default:
                System.out.println("Não tem sala pra esse número de alunos não fei.");
                break;
        }
    }
}
