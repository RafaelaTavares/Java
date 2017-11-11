package br.edu.univas.tp4.model.TO;

import java.sql.Time;

public class AgendarViagemTO {
	
	int codViagem;
	String endereco;
	int quantPassageiro;
	String dataSaida;
	String dataRetorno;
	String horaSaida;
	String horaRetorno;
	int statusViagem;
	float valorViagem;
	
	public AgendarViagemTO(int codViagem, String endereco, int quantPassageiro, String dataSaida,	String dataRetorno, 
			String horaSaida, String horaRetorno, int statusViagem, float valorViagem){
		this.codViagem = codViagem;
		this.endereco = endereco;
		this.quantPassageiro = quantPassageiro;
		this.dataSaida = dataSaida;
		this.dataRetorno = dataRetorno;
		this.horaSaida = horaSaida;
		this.horaRetorno = horaRetorno;
		this.statusViagem = statusViagem;
		this.valorViagem = valorViagem;
		
	}

	public int getCodViagem() {
		return codViagem;
	}

	public void setCodViagem(int codViagem) {
		this.codViagem = codViagem;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQuantPassageiro() {
		return quantPassageiro;
	}

	public void setQuantPassageiro(int quantPassageiro) {
		this.quantPassageiro = quantPassageiro;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(String dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getHoraRetorno() {
		return horaRetorno;
	}

	public void setHoraRetorno(String horaRetorno) {
		this.horaRetorno = horaRetorno;
	}

	public int getStatusViagem() {
		return statusViagem;
	}

	public void setStatusViagem(int statusViagem) {
		this.statusViagem = statusViagem;
	}

	public float getValorViagem() {
		return valorViagem;
	}

	public void setValorViagem(float valorViagem) {
		this.valorViagem = valorViagem;
	}
	
	
}
