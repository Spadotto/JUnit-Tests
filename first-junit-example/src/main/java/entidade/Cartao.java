package entidade;

public class Cartao {
	
	private String numCartao;
	private double saldo;
	
	public Cartao(String numCartao, Double saldo) {
		super();
		this.numCartao = numCartao;
		this.saldo = saldo;
	}
	
	public Cartao(String numCartao) {
		super();
		this.numCartao = numCartao;
	}
	
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
