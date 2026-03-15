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
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("MENU:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha a operação: ");
            int opcao = sc.nextInt();
            if(opcao == 0) {
                System.out.println("Encerrando programa.....");
                break;
            }
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.somar(num1, num2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("Resultado: " + calc.dividir(num1, num2));
                    break;

            }
        }
        sc.close();
       
    } 
}