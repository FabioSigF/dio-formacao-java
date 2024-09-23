package com.bancodigital;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Monopoly Banking");

        Cliente fabio = new Cliente();
        fabio.setNome("Fábio");

        Conta cc = new ContaCorrente(fabio);
        Conta poupanca = new ContaPoupanca(fabio);

        List<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc);
        listaDeContas.add(poupanca);

        banco.setContas(listaDeContas);
        banco.listarContas();
    }
}