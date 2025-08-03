package questao06;

import java.util.Scanner;

public class Principal {
    public static void main (String [] args ){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Informe o primeriro número: ");
        num1 = entrada.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = entrada.nextInt();

        if (num1 < num2 && num1 < num3){
            System.out.printf("O número %d é o menor número entre os outros digitados.", num1 );
        } else if (num2 < num1 && num2 < num3){
            System.out.printf("O número %d é o menor número entre os outros digitados.", num2 );
        } else if (num3 < num1 && num3 < num2){
            System.out.printf("O número %d é o menor número entre os outros digitados.", num3 );
        } else {
            System.out.println("Os números digitados são iguais.");
        }
    }
}
