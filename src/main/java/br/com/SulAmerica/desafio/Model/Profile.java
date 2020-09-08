package br.com.SulAmerica.desafio.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "profile")
public class Profile {
    private Long id;
    private String profileName;
}
