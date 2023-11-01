package modelo;

public class Veiculo {
	private int ano;
	private String placa;
	private String modelo;
	private String fabricante;
	private String cor;

	public Veiculo(String placa, String modelo, String fabricante, String cor, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getModelo() {
		return modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getCor() {
		return cor;
	}

	public int getAno() {
		return ano;
	}

	public String getVeiculo() {
		return fabricante+ ", " +modelo+ ", " +cor+ ", " +ano+ ", " +placa;
	}

}
