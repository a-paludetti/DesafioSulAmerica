package br.com.SulAmerica.desafio.Model;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String name;
    private String CPF;
    private char gender;
    private String birthDate;
    private Position position;
    private Profile profile;
    private boolean status;

    public User(String name, String CPF, Position position, Profile profile, char gender, String birthDate) {
        this.name = name;
        this.CPF = CPF;
        this.position = position;
        this.profile = profile;
        this.gender = gender;
        this.birthDate = birthDate;
        this.id = createId();
        this.status = true;
    }

    private UUID createId() {
        return UUID.randomUUID();
    }
}
