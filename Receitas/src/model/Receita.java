package model;

import java.util.List;

public class Receita {
	private Integer codigo;
	private String nome;
	private Character tipo;
	private Double tempoPreparo;
	private String modoDeFazer;
	private Double valorBasico;
	private List<Ingrediente> ingredientes;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public Double getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(Double tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public String getModoDeFazer() {
		return modoDeFazer;
	}

	public void setModoDeFazer(String modoDeFazer) {
		this.modoDeFazer = modoDeFazer;
	}

	public Double getValorBasico() {
		return valorBasico;
	}

	public void setValorBasico(Double valorBasico) {
		this.valorBasico = valorBasico;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Receita [codigo=" + codigo + ", nome=" + nome + ", tipo=" + tipo + ", tempoPreparo=" + tempoPreparo + ", modoDeFazer=" + modoDeFazer + ", valorBasico=" + valorBasico + ", ingredientes=" + ingredientes + "]";
	}

}
