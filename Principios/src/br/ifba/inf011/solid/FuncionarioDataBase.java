package br.ifba.inf011.solid;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.ifba.inf011.solid.model.Funcionario;
import br.ifba.inf011.solid.model.Terceirizado;

public class FuncionarioDataBase {
	
	private Map<String, Funcionario> funcionarios;
	
	public FuncionarioDataBase() {
		this.funcionarios = new HashMap<String, Funcionario>();
		this.carregar();
	}
	
	
	public void carregar() {
		Funcionario erich = new Funcionario("ERICH GAMMA", "001", new BigDecimal(10000));
		Funcionario helm = new Funcionario("RICHARD HELM", "002", new BigDecimal(12000));
		Funcionario ralph = new Terceirizado("GATA001", "RALPH JOHNSON", "003", new BigDecimal(11000));
		Funcionario john = new Funcionario("JOHN VLISSIDES", "004", new BigDecimal(15000));
		this.funcionarios.put(erich.getCpf(), erich);
		this.funcionarios.put(helm.getCpf(), helm);
		this.funcionarios.put(ralph.getCpf(), ralph);
		this.funcionarios.put(john.getCpf(), john);	
	}
	
	public void salvar(Funcionario f) {
		this.funcionarios.put(f.getCpf(), f);
	}


	public Funcionario find(String cpf) {
		return this.funcionarios.get(cpf);
	}


	public Collection<Funcionario> findAll() {
		return this.funcionarios.values();
	}


}
