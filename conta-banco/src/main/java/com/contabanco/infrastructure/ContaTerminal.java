package com.contabanco.infrastructure;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da sua conta: ");
        numConta = sc.nextInt();

        System.out.println("Digite o número da sua agência: ");
        agencia = sc.next();

        sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();

        String msg = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(msg);
    }
}