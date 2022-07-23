package model;

public class Ingrediente {
	private String nome;
	private String unidadeMedida;
	private Double quantidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Ingrediente [nome=" + nome + ", unidadeMedida=" + unidadeMedida + ", quantidade=" + quantidade + "]";
	}

}
