package questao04;
import java.util.Scanner;

public class Principal {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        int senha;
        int senhaPadrao = 1234;
        System.out.println("Informe a senha: ");
        senha = entrada.nextInt();

        if (senhaPadrao == senha){
            System.out.println("ACESSO PERMITIDO.");
        } else {
            System.out.println("ACESSO NEGADO.");
        }
    }
}