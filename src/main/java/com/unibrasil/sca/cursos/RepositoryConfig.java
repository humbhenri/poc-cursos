package com.unibrasil.sca.cursos;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.unibrasil.sca.Aluno;
import com.unibrasil.sca.Nota;
import com.unibrasil.sca.Turma;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Turma.class);
        config.exposeIdsFor(Aluno.class);
        config.exposeIdsFor(Nota.class);
    }
}