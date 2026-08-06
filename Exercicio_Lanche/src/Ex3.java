import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a nota da NPA: ");
        int NPA=entrada.nextInt();

        if(NPA>=60)
        {
            System.out.println("Parabéns, você passou!");
        }
        else
        {
            System.out.println("Entre com a nota da NP3: ");
            int NP3=entrada.nextInt();

            int NFA=(NPA+NP3)/2;

            if(NFA>=50)
            {
                System.out.println("Parabéns, você passou!");
            }
            else
            {
                System.out.println("Parabéns, você reprovou! Burro :p");
            }
        }
    }
}
