import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite outro numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Porcentagem");
        System.out.println("6 - Resto");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0){
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            case 5:
                System.out.println("Resultado: " + (numero1 * numero2 / 100));
                break;
            case 6:
                if (numero2 != 0){
                    System.out.println("Resultado: " + (numero1 % numero2));
                } else {
                    System.out.println("Erro: Divisão por zero");
                }
                break;
            default:
                System.out.println("Operação Invalida");
        }

        scanner.close();
    }

}