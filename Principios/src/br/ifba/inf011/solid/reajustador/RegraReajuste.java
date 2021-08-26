package br.ifba.inf011.solid.reajustador;

import java.math.BigDecimal;
import java.util.Date;

import br.ifba.inf011.solid.exception.ValidacaoException;
import br.ifba.inf011.solid.model.Funcionario;

public interface RegraReajuste {
	public void validar(Funcionario funcionario, BigDecimal indice, Date data) throws ValidacaoException;
}
