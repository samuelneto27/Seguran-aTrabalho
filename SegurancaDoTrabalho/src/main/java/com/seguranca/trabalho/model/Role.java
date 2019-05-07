//package com.seguranca.trabalho.Model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Role {
//	
//	@Id
//	private String nomeRole;
//	
//
//	
//	@ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
//    private List<Usuario> usuarios;
//
//	public String getNomeRole() {
//		return nomeRole;
//	}
//
//	public void setNomeRole(String nomeRole) {
//		this.nomeRole = nomeRole;
//	}
//	
//	
//}