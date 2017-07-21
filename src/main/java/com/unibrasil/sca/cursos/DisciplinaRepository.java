package com.unibrasil.sca.cursos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "disciplinas", path = "disciplinas")
public interface DisciplinaRepository extends PagingAndSortingRepository<Disciplina, String>{

}
