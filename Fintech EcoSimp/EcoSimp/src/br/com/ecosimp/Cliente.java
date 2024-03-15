package br.com.ecosimp;

public class Cliente {
	private int id;
	private String nome;
	private String email;
	private int telefone;
	private Conta Conta;
	private String senha;
	
	public Cliente(int id, String nome, String email, String senha,int telefone, Conta Conta) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.Conta = Conta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Conta getConta() {
		return Conta;
	}

	public void setConta(Conta conta) {
		Conta = conta;
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
