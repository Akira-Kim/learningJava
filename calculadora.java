import java.util.Scanner;

public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double raizQuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("Não existe raiz quadrada real de número negativo.");
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            double num1, num2;

            try {
                switch (opcao) {

                    case 1:
                        System.out.print("Primeiro número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = scanner.nextDouble();

                        System.out.println("Resultado = " + somar(num1, num2));
                        break;

                    case 2:
                        System.out.print("Primeiro número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = scanner.nextDouble();

                        System.out.println("Resultado = " + subtrair(num1, num2));
                        break;

                    case 3:
                        System.out.print("Primeiro número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = scanner.nextDouble();

                        System.out.println("Resultado = " + multiplicar(num1, num2));
                        break;

                    case 4:
                        System.out.print("Primeiro número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = scanner.nextDouble();

                        System.out.println("Resultado = " + dividir(num1, num2));
                        break;

                    case 5:
                        System.out.print("Base: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Expoente: ");
                        num2 = scanner.nextDouble();

                        System.out.println("Resultado = " + potencia(num1, num2));
                        break;

                    case 6:
                        System.out.print("Número: ");
                        num1 = scanner.nextDouble();

                        System.out.println("Resultado = " + raizQuadrada(num1));
                        break;

                    case 0:
                        System.out.println("Encerrando calculadora...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        scanner.close();
    }
}