package br.com.SulAmerica.desafio.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private Long id;
    private String name;
    private String CPF;
    private String gender;
    private String birthDate;
    private String position;
    private String profile;
    private boolean status;

    public User(@JsonProperty("id") Long id,
                @JsonProperty("name") String name,
                @JsonProperty("CPF") String CPF,
                @JsonProperty("gender") String gender,
                @JsonProperty("birthday") String birthDate,
                @JsonProperty("position") String position,
                @JsonProperty("profile") String profile,
                @JsonProperty("status") boolean status) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name +
                "', CPF='" + CPF +
                "', position='" + position +
                "', profile='" + profile +
                "', gender='" + gender +
                "', birthdate='" + birthDate +
                "', status=" + status +
                '}';
    }
}
