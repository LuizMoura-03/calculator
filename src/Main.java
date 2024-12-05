import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);  //Criando objeto Scanner para ler as entradas.

        System.out.println("Digite um numero: "); //Solicitando o primeiro numero ao usuario.
        double numero1 = scanner.nextDouble();  // Ler o primeiro número.

        System.out.println("Digite outro numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");  //Criando menu, para o utilizador escolher a operação que deseja.
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Porcentagem");
        System.out.println("6 - Resto");
        int operacao = scanner.nextInt(); // Ler a operação escolhida pelo utilizador.

        switch (operacao) {
            case 1: // Operacão de Adição.
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:  // Operacão de Subtração.
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:  // Operacão de Multiplicação.
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:  // Operacão de Divisão.
                if (numero2 != 0){
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            case 5:  // Operacão de Porcentagem.
                System.out.println("Resultado: " + (numero1 * numero2 / 100));
                break;
            case 6:  // Operacão de Resto.
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