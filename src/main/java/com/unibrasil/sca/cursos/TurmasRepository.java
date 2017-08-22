package com.unibrasil.sca.cursos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.unibrasil.sca.Turma;

@RepositoryRestResource(collectionResourceRel = "turmas", path="turmas")
public interface TurmasRepository extends CrudRepository<Turma, Integer>{
	
	Iterable<Turma> findTurmaByProfessorUsername(@Param("username") String username);
}
