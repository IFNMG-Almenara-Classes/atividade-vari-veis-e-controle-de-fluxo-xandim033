package questao11;
import java.util.Scanner;

public class Principal {
        public static void main (String[]args){
            Scanner entrada = new Scanner(System.in);
            int numero;
            int calculo;
            System.out.println("Digite um número inteiro e positivo: ");
            numero = entrada.nextInt();

            for (int i = 0; i <= numero; i++) {
                if (i % 2 == 0) {
                    System.out.print(-i);
                }
            }
        }
    }
