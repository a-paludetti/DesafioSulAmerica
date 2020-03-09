package br.com.SulAmerica.desafio.Service;

import br.com.SulAmerica.desafio.DAO.PositionAcess;
import br.com.SulAmerica.desafio.DAO.PositionDao;
import br.com.SulAmerica.desafio.Model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServices implements PositionDao {

    private final PositionAcess positionAcess;

    @Autowired
    public PositionServices(@Qualifier("position") PositionAcess positionAcess) {
        this.positionAcess = positionAcess;
    }

    @Override
    public void createNew(Position position) {
        positionAcess.createNew(position);
    }

    @Override
    public String getName(Position position) {
        return positionAcess.getName(position);
    }

    @Override
    public List<Position> listPositions() {
        return positionAcess.listPositions();
    }
}
