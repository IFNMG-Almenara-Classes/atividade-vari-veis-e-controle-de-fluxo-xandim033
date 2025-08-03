package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;

        System.out.println("Escreva a medida do primerio lado do triângulo:");
        lado1 = entrada.nextInt();
        System.out.println("Escreva a medida do segundo lado do triângulo:");
        lado2 = entrada.nextInt();
        System.out.println("Escreva a medida do terceiro lado do triângulo:");
        lado3 = entrada.nextInt();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Esse é um triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Esse é triângulo isósceles.");
        } else {
            System.out.println("Esse é triângulo escaleno.");
        }
        }
    }
