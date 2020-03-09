package br.com.SulAmerica.desafio.Model;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String name;
    private String CPF;
    private String gender;
    private String birthDate;
    private Position position;
    private Profile profile;
    private boolean status;

    public User(String name, String CPF, String gender, String birthDate, Position position, Profile profile, boolean status) {
        this.id = createId();
        this.name = name;
        this.CPF = CPF;
        this.position = position;
        this.profile = profile;
        this.gender = gender;
        this.birthDate = birthDate;
        this.status = status;
    }

    private UUID createId() {
        return UUID.randomUUID();
    }
}
