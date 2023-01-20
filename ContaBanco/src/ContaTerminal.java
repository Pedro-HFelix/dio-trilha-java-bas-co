import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Class Sacanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Mensagem ao usário e o uso do scanner
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite sua Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o seu saldo");
        double saldo = scanner.nextDouble();
        //Exibição de resultado
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo " + saldo + " pjá está disponível para saque");
    }
}