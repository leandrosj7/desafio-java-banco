import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        double saldoConta;
        int conta;
        String nomeCliente,agencia;

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agencia:");
        agencia = sc.nextLine();
        
        System.out.println("Digite o número da Conta:");
        conta = sc.nextInt();

        System.out.println("Digite seu nome:");
        nomeCliente = sc.next();
        saldoConta = 237.48;

        //Exibir a mensagem da conta criada
        System.out.println("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é ["+agencia+"], conta["+conta+"], seu saldo é["+saldoConta+"] e já está disponivel para saque.");
          


    }
}
