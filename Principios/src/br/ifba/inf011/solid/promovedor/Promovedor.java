package br.ifba.inf011.solid.promovedor;

import br.ifba.inf011.solid.model.Cargo;
import br.ifba.inf011.solid.model.Funcionario;

public class Promovedor {
	
	public void promover(Funcionario funcionario) {
		Cargo atual = funcionario.getCargo(); 
		Cargo futuro = atual.proximoCargo();
		funcionario.setCargo(futuro);
	}

}
