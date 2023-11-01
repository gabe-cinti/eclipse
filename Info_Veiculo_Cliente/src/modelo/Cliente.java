package modelo;

public class Cliente {
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	public Cliente(String cpf, String nome, String endereco, String telefone, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}
	
	public String getCliente() {
		return nome+ ", " +cpf+ ", " +telefone+ ", " +endereco+ ", " +email;
	}

}
