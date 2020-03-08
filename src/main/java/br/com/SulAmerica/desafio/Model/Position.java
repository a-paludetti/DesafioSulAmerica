package br.com.SulAmerica.desafio.Model;

import lombok.Data;

import java.util.UUID;

@Data
public class Position {
    private UUID id;

    private String positionName;
}
