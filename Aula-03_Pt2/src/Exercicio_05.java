import java.util.Random;
import java.util.Scanner;

public class Exercicio_05
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int chute;
        int numero_randomizado;

        numero_randomizado=rand.nextInt(10)+1;

        System.out.print("Tente acertar o numero randomizado de 1 a 10: ");
        chute=entrada.nextInt();

        while(chute!=numero_randomizado)
        {
            System.out.print("Errado! Tente mais uma vez: ");
            chute=entrada.nextInt();
        }

        System.out.println("Parabens! Voce acertou o numero!!!");
    }
}
