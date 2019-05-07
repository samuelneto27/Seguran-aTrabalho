package com.seguranca.trabalho.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EMPRESA")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	@NotEmpty(message="Preenchimento do campo de razão social é obrigatório")
	@Column(name = "razaosocial")
	public String razaosocial;

	@CNPJ
	@NotEmpty(message="Preenchimento do campo CNPJ é obrigatório")
	@Column(name = "cnpj")
	public String cnpj;

	@NotEmpty(message="Preenchimento do campo CEP é obrigatório")
	@Column(name = "cep")
	public String cep;

	@NotEmpty(message="Preenchimento do campo logradouro é obrigatório")
	@Column(name = "logradouro")
	public String logradouro;

	@NotEmpty(message="Preenchimento do campo bairro é obrigatório")
	@Column(name = "bairro")
	public String bairro;

	@NotEmpty(message="Preenchimento do campo numero é obrigatório")
	@Column(name = "numero")
	public String numero;

	@NotEmpty(message="Preenchimento do campo Cidade é obrigatório")
	@Column(name = "cidade")
	public String cidade;

	@NotEmpty(message="Preenchimento do campo de estado é obrigatório")
	@Column(name = "uf")
	public String uf;
	
	@NotEmpty(message="Preenchimento do campo Celular é obrigatório")
	@Column(name = "celular")
	public String celular;

	@NotEmpty(message="Preenchimento do campo Telefone é obrigatório")
	@Column(name = "telefone")
	public String telefone;

	@Email
	@NotEmpty(message="Preenchimento do campo Email é obrigatório")
	@Column(name = "email")
	public String email;

	@NotEmpty(message="Preenchimento do campo Complemento é obrigatório")
	@Column(name = "complemento")
	public String complemento;

	@OneToMany(targetEntity = Funcionario.class, mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<Funcionario> funcionarios;

	@OneToMany(targetEntity = PlanoTrabalho.class, mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<PlanoTrabalho> planosTrabalho;

	@OneToMany(targetEntity = Treinamento.class, mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<Treinamento> treinamentos;

	@OneToMany(targetEntity = Setor.class, mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<Setor> setores;
  //cabo
}