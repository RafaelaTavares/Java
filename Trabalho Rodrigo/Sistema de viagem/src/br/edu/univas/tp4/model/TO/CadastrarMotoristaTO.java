package br.edu.univas.tp4.model.TO;

import java.sql.Date;

public class CadastrarMotoristaTO {

	int codMotorista;
	String nome;
	int cpf;
	int rg;
	int cnh;
	char sexo;
	Date dataNascimento;
	int telefone;
	String endereco;
	
	public CadastrarMotoristaTO(int codMotorista, String nome, int cpf, int rg, int cnh, int telefone, String endereco, char sexo, Date dataNascimento){
		this.codMotorista = codMotorista;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getCodMotorista() {
		return codMotorista;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public int getRg() {
		return rg;
	}

	public int getCnh() {
		return cnh;
	}

	public char getSexo() {
		return sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setCodMotorista(int codMotorista) {
		this.codMotorista = codMotorista;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
