package com.seguranca.trabalho.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguranca.trabalho.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {
	



//	public Funcionario savarLista(List<Funcionario> funcionarios) {
//		
//		Funcionario fun = new Funcionario();
//		
//		for(Funcionario f : funcionarios) {
//			
//			fun.nome = f.nome;
//			fun.rg = f.rg;
//			
//			save(fun);
//			
//		}
//		
//		return Funcionario;
//	}


}
