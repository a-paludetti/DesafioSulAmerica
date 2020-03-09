package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.Position;

public interface PositionDao {

    void createNew(Position position);

    String getName(Position position);
}
