package br.com.SulAmerica.desafio.API;

import br.com.SulAmerica.desafio.Model.User;
import br.com.SulAmerica.desafio.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/desafio/user")
@RestController
public class UserController {

    private final UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userServices.addUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userServices.getAllUsers();
    }

    @GetMapping(path = "{update}")
    public void updateUser(@PathVariable("update") User user) {
        userServices.updateUser(user);
    }

    @GetMapping(path = "{cpf}")
    public Optional<User> getUserByCpf(@PathVariable("CPF") String cpf) {
        return userServices.searchUserByCpf(cpf);
    }

    @GetMapping(path = "{name}")
    public List<User> getUserByName(@PathVariable("name") String name) {
        return userServices.searchUserByName(name);
    }
}
