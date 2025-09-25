package calculadora;

import java.util.*;

public class Calculadora {

    static double somar(double num1, double num2) {
        return num1 + num2;
    }

    static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        double numero1, numero2;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Sair.");

            opcao = sc.nextInt();

            if (opcao >=1 && opcao <= 4) {

                System.out.println("Primeiro número: ");
                numero1 = sc.nextDouble();
                System.out.println("Segundo número: ");
                numero2 = sc.nextDouble();


                switch (opcao) {
                    case 1:
                        System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, somar(numero1, numero2));
                        break;
                    case 2:
                        System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, subtrair(numero1, numero2));
                        break;
                    case 3:
                        System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, multiplicar(numero1, numero2));
                        break;
                    case 4:
                        if (numero2 == 0) {
                        System.out.println("Não é possível dividir por 0!");
                        break;
                        }
                        System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, dividir(numero1, numero2));
                        break;
                    case 5:
                        System.out.println("Programa encerrado!");
                        break;
                    default:
                        System.out.println("Insira uma opção válida!");
                }
            } 
        } while (opcao != 5);
        sc.close();
    }
}
