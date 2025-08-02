package questao02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float altura;
    float peso;
    float soma = 0;

    System.out.printf("Informe sua altura: ");
    altura = entrada.nextFloat();
    System.out.printf("Informe seu peso: ");
    peso = entrada.nextFloat();

    soma = peso/(altura*altura);

    if (soma < 18.5){
        System.out.println("Magreza");
    } else if (soma > 18.5 && soma < 24.9){
        System.out.println("Saudável");
    } else if (soma > 25 && soma < 29.9){
        System.out.println("Sobrepeso");
    } else if (soma > 30 && soma < 34.9){
        System.out.println("Obesidade Grau I");
    } else if (soma > 35 && soma < 39.9){
        System.out.println("Obesidade Grau II");
    } else{
        System.out.println("Obesidade Grau III");
    }
    }
}