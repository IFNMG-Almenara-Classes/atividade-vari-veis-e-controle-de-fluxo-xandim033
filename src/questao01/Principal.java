package questao01;
import java.util.Scanner;

public class Principal {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Digite o primeiro número: ");
        x = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        y = entrada.nextInt();

        if(x>y){
            System.out.printf("O número %d é maior que %d.", x, y);
        } else if (y>x){
            System.out.printf("O número 5d é maior que %d.", y, x);
        } else{
            System.out.printf("Os números digitados são iguais");
        }
    }
}