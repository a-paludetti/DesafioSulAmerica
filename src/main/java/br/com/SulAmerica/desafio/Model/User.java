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
    private String position;
    private String profile;
    private boolean status;

    public User(String name, String CPF, String position, String profile) {
        this.name = name;
        this.CPF = CPF;
        this.position = position;
        this.profile = profile;
        id = createId();
    }

    private UUID createId() {
        return UUID.randomUUID();
    }
}
