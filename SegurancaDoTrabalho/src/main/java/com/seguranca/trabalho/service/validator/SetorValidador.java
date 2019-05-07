package com.seguranca.trabalho.service.validator;

import com.seguranca.trabalho.model.Setor;

public class SetorValidador extends Utils {

	public static void getSetor(Setor setor) throws MensagemValidacaoException {

		if (!validString(setor.nome)) {
			throw new MensagemValidacaoException("Favor preencher o campo Nome do setor corretamente");

		}
	}

}
