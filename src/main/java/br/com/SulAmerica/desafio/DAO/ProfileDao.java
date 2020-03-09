package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.Profile;

import java.util.List;

public interface ProfileDao {
    void createNew(Profile profile);

    List<Profile> getProfiles();
}
