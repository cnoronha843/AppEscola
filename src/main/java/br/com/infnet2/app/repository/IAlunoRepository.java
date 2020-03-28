package br.com.infnet2.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet2.app.negocio.Aluno;

@Repository
public interface IAlunoRepository extends CrudRepository<Aluno,Integer> {	

}
