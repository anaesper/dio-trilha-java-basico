import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //criando um objeto scanner
        Scanner scanner = new Scanner(System.in);

        //solicitando ao usuario o seu nome
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        //solicitando ao usuario numero da agencia
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        //solicitando ao usuario numero da conta
        System.out.println("Digite número da conta: ");
        int conta = scanner.nextInt();

        //solicitando o saldo bancario do usuario
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        //imprimindo os dados que foram obtidos do usuario
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
       
        //fechando entrada de dados
        scanner.close();
     
    }
}
