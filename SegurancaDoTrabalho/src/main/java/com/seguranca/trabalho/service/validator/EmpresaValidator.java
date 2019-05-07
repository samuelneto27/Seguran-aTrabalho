package com.seguranca.trabalho.service.validator;



import com.seguranca.trabalho.model.Empresa;

public class EmpresaValidator extends Utils{
	
	public static void getEmpresa(Empresa empresa) throws MensagemValidacaoException {


			if (!validString(empresa.bairro)) {
				throw new MensagemValidacaoException("Favor preencher o campo Bairro corretamente");
			}
			
			if (!validString(empresa.cidade)) {
				throw new MensagemValidacaoException("Favor preencher o campo Cidade corretamente");
			}
			
			if (!validCnpj(empresa.cnpj)) {
				throw new MensagemValidacaoException("Favor preencher o campo CNPJ corretamente");
			}
			
			if (!validString(empresa.complemento)) {
				throw new MensagemValidacaoException("Favor preencher o campo Complemento corretamente");
			}
			
			if (!validString(empresa.logradouro)) {
				throw new MensagemValidacaoException("Favor preencher o campo Logradouro corretamente");
			}
			
			if (!validString(empresa.razaosocial)) {
				throw new MensagemValidacaoException("Favor preencher o campo Razãp Social corretamente");
			}
			
			if (!validString(empresa.uf)) {
				throw new MensagemValidacaoException("Favor preencher o campo Estado corretamente");
			}
			
			if (!validarTelefone(empresa.telefone)) {
				throw new MensagemValidacaoException("Favor preencher o campo Telefone corretamente");
			}
			
			if (!validarTelefone(empresa.celular)) {
				throw new MensagemValidacaoException("Favor preencher o campo Celular corretamente");
			}
			
			if (!validarNumero(empresa.numero)) {
				throw new MensagemValidacaoException("Favor preencher o campo Telefone corretamente");
			}
			
			//ver validação de CEP
			//ver validação de CEP
			//ver validação de CEP
			//ver validação de CEP
			//ver validação de CEP
			//ver validação de CEP
			//ver validação de CEP
			//ver validação de CEP
	}

}
