package entidade;

public class Usuario {
	
	private String cpf;
	private String senha;
	private String nome;
	private Cartao cartao;
	
	public Usuario(Cartao cartao) {
		super();
		this.cartao = cartao;
	}
	
	public Usuario(String cpf, String nome, String senha, Cartao cartao) {
		super();
		this.cartao = cartao;
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
	}
	
	public Usuario(String cpf, String nome, String senha) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
