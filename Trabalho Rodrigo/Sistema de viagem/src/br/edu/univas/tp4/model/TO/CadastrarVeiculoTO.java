package br.edu.univas.tp4.model.TO;

public class CadastrarVeiculoTO {

	private int codVeiculo;
	private String placa;
	private String marca;
	private String uf;
	private int ano;
	private int tipoComb;
	private int quantPassageiro;
	
	public CadastrarVeiculoTO(int codVeiculo, String placa, String marca, String uf, int ano, int tipoComb, int quantPassageiro){
		this.codVeiculo = codVeiculo;
		this.placa = placa;
		this.marca = marca;
		this.uf = uf;
		this.ano = ano;
		this.tipoComb = tipoComb;
		this.quantPassageiro = quantPassageiro;
	}

	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setTipoComb(int tipoComb) {
		this.tipoComb = tipoComb;
	}

	public void setQuantPassageiro(int quantPassageiro) {
		this.quantPassageiro = quantPassageiro;
	}

	public int getCodVeiculo() {
		return codVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getUf() {
		return uf;
	}

	public int getAno() {
		return ano;
	}

	public int getTipoComb() {
		return tipoComb;
	}

	public int getQuantPassageiro() {
		return quantPassageiro;
	}

}
