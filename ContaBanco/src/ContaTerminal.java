import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Por favor, digite a agencia: ");
        sc.nextLine();
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldoDaConta = sc.nextDouble();

        System.out.printf("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta
                + " e seu saldo " +  String.format("%.2f", saldoDaConta)
                + " já está disponível para saque.");

        sc.close();
    }
}
