import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine(); // Consumir a nova linha pendente
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo: " + saldo + " já está disponível para saque!");

    }
}

