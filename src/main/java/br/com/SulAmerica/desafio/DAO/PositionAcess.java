package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.Position;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("position")
public class PositionAcess implements PositionDao {

    private final List<Position> positionList = new ArrayList<>();

    @Override
    public void createNew(Position position) {
        positionList.add(position);
    }

    @Override
    public String getName(Position position) {
        boolean exist = positionList.stream().anyMatch(position1 -> position1.getId().equals(position.getId()));
        if (exist) {
            return position.getPositionName();
        } else {
            return null;
        }
    }

    @Override
    public List<Position> listPositions() {
        return positionList;
    }
}
