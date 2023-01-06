import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
            System.out.println("Por favor, digite seu nome.");
            String usuario = scanner.next();

            System.out.println("Por favor, digite sua agência");
            String agencia = scanner.next();

            System.out.println("Por favor, digite sua conta");
            int numerodaconta = scanner.nextInt();

            System.out.println("Por favor, digite seu saldo");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ". Sua conta é: " + numerodaconta + ". Seu saldo disponível para saque é: R$" + saldo);
        }
        }
    }
