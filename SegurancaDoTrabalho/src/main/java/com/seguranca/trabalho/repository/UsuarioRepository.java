package com.seguranca.trabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seguranca.trabalho.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByEmail(String email);

	Usuario findBySenha(String senha);

	@Query(value = "SELECT * FROM usuario u WHERE u.email = :email && u.senha = :senha", nativeQuery = true)
	List<Usuario> checkLogin(@Param("email") String email, @Param("senha") String senha);

}
