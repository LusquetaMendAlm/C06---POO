import java.util.Scanner;

public class Lanche
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número de lanches1: ");
        int lanche1=entrada.nextInt();

        System.out.println("Entre com o número de lanches1: ");
        int lanche2=entrada.nextInt();

        System.out.println("Entre com o número de lanches1: ");
        int lanche3=entrada.nextInt();

        int soma=lanche1+lanche2+lanche3;
        float media = (float)soma/3;

        System.out.println("O número total de lanches é: "+soma);
        System.out.println("A média de lanches é: "+media);
    }
}
