package com.bank.aulas;

import com.bank.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoCliente {
    private List<Cliente> listaClientes = new ArrayList<>();


    public boolean adicionarCliente(Cliente novoCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equals(novoCliente.getCpf())) {
                System.out.println("cliente já existe");
                return false;
            }
        }
        listaClientes.add(novoCliente);
        System.out.println("cliente adicionado");
        return true;
    }

}
