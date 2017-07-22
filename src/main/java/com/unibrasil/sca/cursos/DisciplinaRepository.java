package com.unibrasil.sca.cursos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "disciplinas", path = "disciplinas", exported = false)
@Repository
public interface DisciplinaRepository extends PagingAndSortingRepository<Disciplina, String> {

}
