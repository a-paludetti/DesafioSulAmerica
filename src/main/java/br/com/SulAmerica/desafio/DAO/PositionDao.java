package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.Position;

import java.util.List;

public interface PositionDao {

    void createNew(Position position);

    String getName(Position position);

    List<Position> listPositions();
}
