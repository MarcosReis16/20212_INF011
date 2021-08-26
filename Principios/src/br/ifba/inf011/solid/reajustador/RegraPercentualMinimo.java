package br.ifba.inf011.solid.reajustador;

import java.math.BigDecimal;
import java.util.Date;

import br.ifba.inf011.solid.exception.ValidacaoException;
import br.ifba.inf011.solid.model.Funcionario;

public class RegraPercentualMinimo implements RegraReajuste{

	@Override
	public void validar(Funcionario funcionario, BigDecimal indice, Date data) throws ValidacaoException {
		BigDecimal indiceMaximo = new BigDecimal(0.05);
		if(indice.compareTo(indiceMaximo) < 0)
			throw new ValidacaoException("PERCENTUAL MENOR QUE O PERMITIDO");
		
	}

}