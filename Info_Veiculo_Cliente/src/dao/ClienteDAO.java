package dao;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    private List<Cliente> listaClientes;

    public ClienteDAO() {

        listaClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public List<Cliente> obterListaClientes() {
        return listaClientes;
    }

    public void removerCliente(Cliente cliente) {
    	listaClientes.remove(cliente);
    }
}
