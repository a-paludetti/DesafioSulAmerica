package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionCrud extends CrudRepository<Position, Long> {
}
