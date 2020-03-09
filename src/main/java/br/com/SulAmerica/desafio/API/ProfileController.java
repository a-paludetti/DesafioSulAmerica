package br.com.SulAmerica.desafio.API;

import br.com.SulAmerica.desafio.Model.Profile;
import br.com.SulAmerica.desafio.Service.ProfileServices;
import com.sun.deploy.perf.PerfRollup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/desafio/profile")
@RestController
public class ProfileController {
    private final ProfileServices profileServices;

    @Autowired
    public ProfileController(ProfileServices profileServices) {
        this.profileServices = profileServices;
    }

    @GetMapping
    public List<Profile> getProfiles() {
        return profileServices.getProfiles();
    }
}
