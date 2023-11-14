package view;

import model.Veiculo;

import java.util.List;

public class VeiculoView {
    public void exibirListaVeiculos(List<Veiculo> veiculos) {
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Veiculos cadastrados:");
        System.out.println("---------------------");
        System.out.println("");
        
        //Para cada Veiculo chamado veiculo dentro de veiculos
        for (Veiculo veiculo : veiculos) {
            System.out.println("Veículo " +veiculo.getIdVeiculo()+ ": ");
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Fabricante: " + veiculo.getFabricante());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("");
        }
        
        System.out.println("--------------------");
    }

    public void removerVeiculo(boolean veiculoRemovido) {
        if (veiculoRemovido) {
        	System.out.println("Veiculo removido com sucesso!");
        	System.out.println("");
        }
        
        else {
        	System.out.println("Veiculo não encontrado na lista.");        
        	System.out.println("");
        }
    }

    public void exibirVeiculo(Veiculo veiculo) {
    	System.out.println("Veículo " +veiculo.getIdVeiculo()+ ": ");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Fabricante: " + veiculo.getFabricante());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("");
    }
}
