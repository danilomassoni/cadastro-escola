package com.escola.cadastroescola.database;

import com.escola.cadastroescola.orm.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEscola extends JpaRepository<Escola, Long> {

}
