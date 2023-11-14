package view;

import model.Cliente;

import java.util.List;

public class ClienteView {
    public void exibirListaClientes(List<Cliente> clientes) {
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Clientes cadastrados:");
        System.out.println("---------------------");
        System.out.println("");
        
        //Para cada Cliente chamado cliente dentro de clientes
        for (Cliente cliente : clientes) {
            System.out.println("Cliente " +cliente.getIdCliente()+ ": ");
            System.out.println("Nome: " +cliente.getNome());
            System.out.println("CPF: " +cliente.getCPF());
            System.out.println("Telefone: " +cliente.getTelefone());
            System.out.println("Endereço: " +cliente.getEndereco());
            System.out.println("Email: " +cliente.getEmail());
            System.out.println("");
        }
        
        System.out.println("---------------------");
    }

    public void removerCliente(boolean clienteRemovido) {
        if (clienteRemovido) {
        	System.out.println("Cliente removido com sucesso!");
        	System.out.println("");
        }
        
        else {
        	System.out.println("Cliente não encontrado na lista.");        
        	System.out.println("");
        }
    }

    public void exibirCliente(Cliente cliente) {
        System.out.println("Cliente " +cliente.getIdCliente()+ ": ");
        System.out.println("Nome: " +cliente.getNome());
        System.out.println("CPF: " +cliente.getCPF());
        System.out.println("Telefone: " +cliente.getTelefone());
        System.out.println("Endereço: " +cliente.getEndereco());
        System.out.println("Email: " +cliente.getEmail());
        System.out.println("");
    }
}
