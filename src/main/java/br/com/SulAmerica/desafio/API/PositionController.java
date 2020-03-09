package br.com.SulAmerica.desafio.API;

import br.com.SulAmerica.desafio.Model.Position;
import br.com.SulAmerica.desafio.Service.PositionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/desafio/position")
@RestController
public class PositionController {
    private final PositionServices positionServices;

    @Autowired
    public PositionController(PositionServices positionServices) {
        this.positionServices = positionServices;
    }

    @GetMapping
    public List<Position> getPositions(){
        return positionServices.listPositions();
    }
}
