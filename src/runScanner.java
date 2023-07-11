
import java.util.Locale;
import java.util.Scanner;


public class runScanner {
    public static void main(String[] args) {
  

    double saque;
    double deposito;

    contaScanner runScanner = new contaScanner();
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);    



    System.out.println("Digite seu nome");
    runScanner.setTitular(scanner.next());    

    System.out.println("Digite o número da sua conta");
    runScanner.setNconta(scanner.nextInt());

    System.out.println("Informe qual a sua Agência");
    runScanner.setAgencia(scanner.next());


    System.out.println("\n\nBem vindo ---> " + runScanner.getTitular() + "\nBanco: " + runScanner.getAgencia() + "\nNúmero da conta: " + runScanner.getNconta() + "\nSaldo: " + runScanner.getSaldo() );
        System.out.println("Data de abertura: " + runScanner.getDataabertura());

        System.out.println("Informe o quanto deseja sacar ");
        saque = scanner.nextDouble();

        runScanner.sacar(saque);
        System.out.println("Seu saldo atual é de R$ " + runScanner.getSaldo()  );


        System.out.println("Informe o valor de depósito ");
        deposito = scanner.nextDouble();

        runScanner.depositar(deposito);
        System.out.println("Seu saldo atual depois deste despósito é de " + runScanner.getSaldo() );

        runScanner.rend();
        System.out.println("Com rendimento de " + runScanner.getRendimento() + " ao mês");    




        scanner.close();
            
    }
}

