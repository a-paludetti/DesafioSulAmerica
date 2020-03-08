package br.com.SulAmerica.desafio.Model;

import lombok.Data;

import java.util.UUID;

@Data
public class Profile {
    private UUID id;
    private String profileName;
}
