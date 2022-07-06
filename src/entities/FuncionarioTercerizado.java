package entities;

public class FuncionarioTercerizado extends Funcionario {
	
	private Double DispesaAdicional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer hora, Double valorPorHora, Double dispesaAdicional) {
		super(nome, hora, valorPorHora);
		DispesaAdicional = dispesaAdicional;
	}

	public Double getDispesaAdicional() {
		return DispesaAdicional;
	}

	public void setDispesaAdicional(Double dispesaAdicional) {
		DispesaAdicional = dispesaAdicional;
	}
	@Override
		public Double Pagamento() {
		
		return super.Pagamento() + DispesaAdicional * 1.1;
	}

}
