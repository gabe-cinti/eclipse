package dao;

import model.Veiculo;

import java.util.ArrayList;
import java.util.List;


public class VeiculoDAO {
    private List<Veiculo> listaVeiculos;

    public VeiculoDAO() {

    	listaVeiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
    	listaVeiculos.add(veiculo);
    }

    public List<Veiculo> obterListaVeiculos() {
        return listaVeiculos;
    }

    public void removerVeiculo(Veiculo veiculo) {
    	listaVeiculos.remove(veiculo);
    }
}