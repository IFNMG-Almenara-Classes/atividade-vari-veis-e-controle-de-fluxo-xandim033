package questao03;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int x;
    System.out.println("Digite um número: ");
    x = entrada.nextInt();

    if (x % 2 == 0){
        System.out.println("O número digitado é par.");
    } else {
        System.out.println("O número digitado é ímpar.");

    }
    }
}