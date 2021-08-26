package br.ifba.inf011.solid.model;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

import br.ifba.inf011.solid.exception.ValidacaoException;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	private Date dataUltReajuste;
	private Endereco endereco;
	
	public Funcionario(String nome, String cpf, BigDecimal salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.cargo = Cargo.ASSISTENTE;
		this.dataUltReajuste = new Date();
		this.endereco = new Endereco();
	}

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario, Date dataUltReajuste, String rua,
			String numero, String cep) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.dataUltReajuste = dataUltReajuste;

	}
	
	public String getRua() {
		return this.endereco.getRua();
	}
	
	public void setRua(String rua) {
		this.endereco.setRua(rua);
	}
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cargo getCargo() {
		return cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public Date getDataUltReajuste() {
		return dataUltReajuste;
	}
	public void setDataUltReajuste(Date dataUltReajuste) {
		this.dataUltReajuste = dataUltReajuste;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", cargo=" + cargo + ", salario=" + salario
				+ ", dataUltReajuste=" + dataUltReajuste + "]";
	}
	
}
