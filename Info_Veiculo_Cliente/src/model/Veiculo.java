package model;

public class Veiculo {
	private int idVeiculo;
	private String placa;
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;

	public Veiculo(int idVeiculo, String placa, String modelo, String fabricante, String cor, int ano) {
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.ano = ano;
	}
	
	public int getIdVeiculo() {
		return idVeiculo;
	}
	
	public String getPlaca() {
		return placa;
	}

	public String getFabricante() {
		return fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		return "Veiculo " +idVeiculo+ ": " +placa+ ", " +fabricante+ ", " +modelo+ ", " +cor+ ", " +ano;
	}

}
