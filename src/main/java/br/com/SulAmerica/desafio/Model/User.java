package br.com.SulAmerica.desafio.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String CPF;
    private String gender;
    private String birthDate;
    private String position;
    private String profile;
    @Value("${some.key:true}")
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

    /*Getter & Setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
