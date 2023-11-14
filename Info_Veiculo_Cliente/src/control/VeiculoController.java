package control;

import model.Veiculo;
import dao.VeiculoDAO;
import view.VeiculoView;

import java.util.List;

public class VeiculoController {
    private VeiculoDAO veiculoDAO;
    private VeiculoView veiculoView;

    public VeiculoController() {
    	veiculoDAO = new VeiculoDAO();
    	veiculoView = new VeiculoView();
    }

    public void adicionarVeiculo(int idVeiculo, String placa, String modelo, String fabricante, String cor, int ano) {
    	Veiculo veiculo = new Veiculo(idVeiculo, placa, modelo, fabricante, cor, ano);
        veiculoDAO.adicionarVeiculo(veiculo);
    }

    public void exibirListaVeiculos(Veiculo veiculos) {
        List<Veiculo> listaVeiculos = veiculoDAO.obterListaVeiculos();
        veiculoView.exibirListaVeiculos(listaVeiculos);
    }
    
    public void removerVeiculo(String placaVeiculoRemover) {
    	boolean veiculoRemovido = false;
        for (Veiculo veiculo : veiculoDAO.obterListaVeiculos()) {
            if (veiculo.getPlaca().equalsIgnoreCase(placaVeiculoRemover)) {
            	veiculoDAO.removerVeiculo(veiculo);
            	veiculoRemovido = true;
                break;
            }
        }
        veiculoView.removerVeiculo(veiculoRemovido);
    }
}

