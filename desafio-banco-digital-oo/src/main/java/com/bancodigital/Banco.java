package com.bancodigital;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Banco {

    @NonNull private String nome;
    private List<Conta> contas;

    public void listarContas() {
        if (contas == null || contas.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("Contas cadastrados no banco " + nome + ":");
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome());
        }
    }
}