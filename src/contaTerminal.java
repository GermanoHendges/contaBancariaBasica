import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao banco da DIO, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("digite a sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println("digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta " + numeroAgencia + " e seu saldo de R$" + saldo + " já está disponível para saque.");



    }
}
