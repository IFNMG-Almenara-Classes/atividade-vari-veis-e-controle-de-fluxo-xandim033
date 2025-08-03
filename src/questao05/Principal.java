package questao05;

import java.util.Scanner;

public class Principal {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int quantidade;
        float duzia = 0.50f;
        float maisQueDuzia = 0.30f;
        float calculo1 = 0f;
        float calculo2 = 0f;

        System.out.println("Informe a quantidade de laranjas que voçê deseja: ");
        quantidade = entrada.nextInt();

        calculo1 = quantidade * duzia;
        calculo2 = quantidade * maisQueDuzia;
        if (quantidade <= 12){
            System.out.printf("%d de laranjas da R$%.2f", quantidade, calculo1);
        } else {
            System.out.printf("%d de laranjas da R$%.2f", quantidade, calculo2);
        }
    }
}
