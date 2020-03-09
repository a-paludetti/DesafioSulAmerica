package br.com.SulAmerica.desafio.Service;

import br.com.SulAmerica.desafio.DAO.ProfileAcess;
import br.com.SulAmerica.desafio.Model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServices {
    private final ProfileAcess profileAcess;

    @Autowired
    public ProfileServices(ProfileAcess profileAcess) {
        this.profileAcess = profileAcess;
    }

    public void createProfile(Profile profile) {
        profileAcess.createNew(profile);
    }

    public List<Profile> getProfiles() {
        return profileAcess.getProfiles();
    }
}
