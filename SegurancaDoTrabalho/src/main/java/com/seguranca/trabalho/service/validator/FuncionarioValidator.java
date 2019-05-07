package com.seguranca.trabalho.service.validator;

import java.util.List;

import com.seguranca.trabalho.model.Funcionario;

public class FuncionarioValidator extends Utils {

	public static void getFuncionario(List<Funcionario> listFuncionario) throws MensagemValidacaoException {

		for (Funcionario funcionario : listFuncionario) {

			if (!validString(funcionario.nome)) {
				throw new MensagemValidacaoException("Favor preencher o campo nome corretamente");
			}
			
			else if (!validString(funcionario.primeiroNome)) {
				throw new MensagemValidacaoException("Favor preencher o campo Primeiro Nome corretamente");
			}
			
			else if (!validString(funcionario.segundoNome)) {
				throw new MensagemValidacaoException("Favor preencher o campo Segundo Nome corretamente");
			}
			
			else if (!validString(funcionario.periodo)) {
				throw new MensagemValidacaoException("Favor preencher o campo Periodo corretamente");
			}
			
			else if (!validString(funcionario.rg)) {
				throw new MensagemValidacaoException("Favor preencher o campo RG corretamente");
			}
			
			else if (!validString(funcionario.sexo)) {
				throw new MensagemValidacaoException("Favor preencher o campo Sexo corretamente");
			}
		
			else if (!validarTelefone(funcionario.celular)) {
				throw new MensagemValidacaoException("Favor preencher o campo Telefone corretamente");
			}
		}

	}
}
