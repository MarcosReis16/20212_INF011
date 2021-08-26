package br.ifba.inf011.solid.model;

import java.math.BigDecimal;
import java.util.Date;

import resposta.ValidacaoException;

public class Terceirizado extends Funcionario{

	private String nomeEmpresa;
	
	public Terceirizado(String nomeEmpresa, String nome, String cpf, BigDecimal salario) {
		super(nome, cpf, salario);
		this.nomeEmpresa = nomeEmpresa;
	}

	public Terceirizado(String nomeEmpresa, String nome, String cpf, Cargo cargo, BigDecimal salario, Date dataUltReajuste, String rua,
			String numero, String cep) {
		super(nome, cpf, cargo, salario, dataUltReajuste, rua, numero, cep);
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public void setSalario(BigDecimal salario) {
	}
	
	public void setDataUltReajuste(Date dataUltReajuste) {
	}

	public void setCargo(Cargo cargo) {
		throw new ValidacaoException("Terceiro não pode ser promovido"); 
	}	

	@Override
	public String toString() {
		return "Terceirizado [nomeEmpresa=" + nomeEmpresa + ", toString()=" + super.toString() + "]";
	}
	
	

}
