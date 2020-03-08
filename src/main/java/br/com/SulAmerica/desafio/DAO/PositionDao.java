package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.Position;

public interface PositionDao {

    Position createNewPosition(Position position);

    void inactivatePosition(Position position);
}
