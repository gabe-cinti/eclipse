package model;

public class Cliente {
	private int idCliente;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	public Cliente(int idCliente, String nome, String cpf, String telefone, String endereco, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Cliente " +idCliente+ ": " +nome+ ", " +cpf+ ", " +telefone+ ", " +endereco+ ", " +email;
	}

}
