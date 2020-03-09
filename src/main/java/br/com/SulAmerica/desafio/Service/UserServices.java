package br.com.SulAmerica.desafio.Service;

import br.com.SulAmerica.desafio.DAO.UserAcess;
import br.com.SulAmerica.desafio.DAO.UserDao;
import br.com.SulAmerica.desafio.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    private final UserAcess userAcess;

    @Autowired
    public UserServices(@Qualifier("User") UserAcess userAcess) {
        this.userAcess = userAcess;
    }

    public void addUser(User user) {
        userAcess.newUser(user);
    }

    public List<User> getAllUsers() {
        return userAcess.listUsers();
    }

    public void updateUser(User user) {
        userAcess.updateUser(user);
    }

    public void deleteUser(User user) {
        userAcess.removeUser(user.getId());
    }

    public List<User> searchUserByName(String name) {
        return userAcess.selectUserByName(name);
    }

    public Optional<User> searchUserByCpf(String cpf) {
        return userAcess.selectUserByCPF(cpf);
    }

    public List<User> searchByProfile(String profile) {
        return userAcess.getUserByProfile(profile);
    }

    public List<User> searchByPosition(String position) {
        return userAcess.getUserByPosition(position);
    }

    public List<User> searchByStatus(String status){
        return userAcess.getUserByStatus(status);
    }

    public List<User> searchByGenderAndAge(String gender, String Age){
        return userAcess.getUserByGenderAge(gender, Age);
    }

    public List<User> searchByDigit(String digit){
        return userAcess.getUserByFirstDigit(digit);
    }
}
