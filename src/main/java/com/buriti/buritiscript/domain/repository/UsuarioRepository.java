package com.buriti.buritiscript.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.buriti.buritiscript.domain.model.Usuario;
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String>{
	Usuario findByLogin(String login);
}
