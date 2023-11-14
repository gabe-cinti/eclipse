package control;

import model.Cliente;
import dao.ClienteDAO;
import view.ClienteView;

import java.util.List;

public class ClienteController {
    private ClienteDAO clienteDAO;
    private ClienteView clienteView;

    public ClienteController() {
        clienteDAO = new ClienteDAO();
        clienteView = new ClienteView();
    }

    public void adicionarCliente(int idCliente, String nome, String cpf, String telefone, String endereco, String email) {
        Cliente cliente = new Cliente(idCliente, nome, cpf, telefone, endereco, email);
        clienteDAO.adicionarCliente(cliente);
    }

    public void exibirListaClientes(Cliente clientes) {
        List<Cliente> listaClientes = clienteDAO.obterListaClientes();
		clienteView.exibirListaClientes(listaClientes);
    }
    
    public void removerCliente(String cpfClienteRemover) {
    	boolean clienteRemovido = false;
        for (Cliente cliente : clienteDAO.obterListaClientes()) {
            if (cliente.getCPF().equalsIgnoreCase(cpfClienteRemover)) {
            	clienteDAO.removerCliente(cliente);
            	clienteRemovido = true;
                break;
            }
        }
        clienteView.removerCliente(clienteRemovido);
    }
}
