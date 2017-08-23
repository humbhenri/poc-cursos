package com.unibrasil.sca.cursos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.unibrasil.sca.Nota;

@RepositoryRestResource(collectionResourceRel = "notas", path="notas")
public interface NotasRepository extends CrudRepository<Nota, Integer>{

	Iterable<Nota> findByTurmaId(@Param("id") Integer id);
}
