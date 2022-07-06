package entities;

public class Funcionario {
	
	private String nome;
	private Integer hora;
	private Double ValorPorHora;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Integer hora, Double valorPorHora) {
		this.nome = nome;
		this.hora = hora;
		ValorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorPorHora() {
		return ValorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		ValorPorHora = valorPorHora;
	}
	public Double Pagamento() {
		
		return hora * ValorPorHora;
	}
}
