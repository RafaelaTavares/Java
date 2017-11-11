package br.edu.univas.tp4.model.TO;

import java.sql.Date;

public class CadastrarUsuarioTO {

	int codUsuario;
	String nome;
	int cpf;
	int rg;
	char sexo;
	Date dataNascimento;
	int telefone;
	String endereco;
	
	public CadastrarUsuarioTO(int codUsuario, String nome, int cpf, int rg, char sexo, Date dataNascimento, int telefone, String endereco){
		this.codUsuario = codUsuario;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getCodUsuario() {
		return codUsuario;
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

	public char getSexo() {
		return sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
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

	public int getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

}
