package Calculadora;
import java.util.Scanner;

/**
 * Calculadora.java
 * 
 * Este programa implementa uma calculadora simples que pode realizar operações básicas como adição, subtração, multiplicação e divisão. O usuário pode escolher a operação desejada e inserir os números para obter o resultado.
 * 
 * @author Luana
 * @version 1.0
 */

public class Calculadora {
    double somar(double a, double b) {
        return a + b;
    }

    double subtrair(double a, double b) {
        return a - b;
    }

    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo à Calculadora!");
        System.out.print("OBS: Digite 0 para sair.\n");
        while (true) {
            System.out.println("MENU:");
            System.out.print("1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n");
            System.out.print("Escolha uma operação (1-4) ou 0 para sair: ");
            int escolha = scan.nextInt();
        }
    }
}