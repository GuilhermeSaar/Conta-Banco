package program;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaTerminal;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Por favor, digite o número da Agência: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Déposito inicial: ");
        double saldo = sc.nextDouble();
        


        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.println(contaTerminal.toString());


        sc.close();
    }
}
