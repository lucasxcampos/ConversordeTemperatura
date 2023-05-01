import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de temperatura.");
        System.out.println("Digite 1 para converter de Celsius para Fahrenheit.");
        System.out.println("Digite 2 para converter de Fahrenheit para Celsius.");

        int escolha = scanner.nextInt();
        double temperatura;

        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius:");
            temperatura = scanner.nextDouble();

            double temperaturaConvertida = (temperatura * 1.8) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + temperaturaConvertida);
        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            temperatura = scanner.nextDouble();

            double temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.println("A temperatura em Celsius é: " + temperaturaConvertida);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
