import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
        
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        String agenciaConta = scanner.next(); 
        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o sobrenome do Cliente: ");
        String sobrenomeCliente = scanner.next();
        System.out.println("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá "+ nomeCliente.concat(sobrenomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaConta + ", conta: "+ numeroConta + " e seu saldo de R$"+saldoConta + " já está disponível para saque.");
 
        
    }
}