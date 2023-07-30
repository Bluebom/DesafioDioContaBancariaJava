package br.info.desafio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Por favor, digite o seu nome e sobrenome!");
        conta.setNomeCliente(scanner.next());
        conta.setNomeCliente(String.format("%s%s", conta.getNomeCliente(), scanner.nextLine()));

        System.out.println("Por favor, digite o nome da sua Agência!");
        conta.setNomeAgencia(scanner.next());

        System.out.println("Por favor, digite o número da sua Agência!");
        conta.setNumeroConta(scanner.nextInt());

        System.out.println("Por favor, digite seu saldo atual nessa conta!");
        conta.setSaldoConta(scanner.nextDouble());

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                conta.getNomeCliente(), conta.getNomeAgencia(), conta.getNumeroConta(), conta.getSaldoConta()
        );
    }
}