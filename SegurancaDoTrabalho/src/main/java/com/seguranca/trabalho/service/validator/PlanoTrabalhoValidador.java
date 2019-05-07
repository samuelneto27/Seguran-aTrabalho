package com.seguranca.trabalho.service.validator;

import com.seguranca.trabalho.model.PlanoTrabalho;

public class PlanoTrabalhoValidador extends Utils {
	
	public static void getPlanoTrabalho(PlanoTrabalho plano ) throws MensagemValidacaoException{
		
//		if (!validarData(plano.dataInicial)) {
//			throw new MensagemValidacaoException("Favor preencher o campo Data Inicial corretamente");
//		}
		
		//falta outra data
		//fazer validaçao de ser da mesma data e a data inicial nao tem pode ser maior que a do final
		
		if (!validString(plano.estrategia)) {
			throw new MensagemValidacaoException("Favor preencher o campo Estratégia corretamente");
		}
		
		if (!validString(plano.grupoRisco)) {
			throw new MensagemValidacaoException("Favor preencher o campo de grupo de risco corretamente");
		}
		
		if (!validString(plano.responsavel)) {
			throw new MensagemValidacaoException("Favor preencher o campo de responsavel corretamente");
		}
		
		if (!validString(plano.risco)) {
			throw new MensagemValidacaoException("Favor preencher o campo de risco corretamente");
		}
		
		if (!validString(plano.setor)) {
			throw new MensagemValidacaoException("Favor preencher o campo de setor corretamente");
		}
		
	}

}
