package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileAcess implements ProfileDao {

    private List<Profile> profileList = new ArrayList<>();

    @Override
    public void createNew(Profile profile) {
        profileList.add(profile);
    }
}
