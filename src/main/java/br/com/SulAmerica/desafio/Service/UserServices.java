package br.com.SulAmerica.desafio.Service;

import br.com.SulAmerica.desafio.DAO.UserDao;
import br.com.SulAmerica.desafio.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    private final UserDao userDao;

    @Autowired
    public UserServices(@Qualifier("User") UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(User user) {
        userDao.newUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.listUsers();
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(User user) {
        userDao.removeUser(user.getId());
    }

    public List<User> searchUserByName(String name) {
        return userDao.selectUserByName(name);
    }

    public Optional<User> searchUserByCpf(String cpf) {
        return userDao.selectUserByCPF(cpf);
    }

    public List<User> searchByProfile(String profile) {
        return userDao.getUserByProfile(profile);
    }

    public List<User> searchByPosition(String position) {
        return userDao.getUserByPosition(position);
    }

    public List<User> searchByStatus(String status){
        return userDao.getUserByStatus(status);
    }

    public List<User> searchByGenderAndAge(String gender, String Age){
        return userDao.getUserByGenderAge(gender, Age);
    }

    public List<User> searchByDigit(String digit){
        return userDao.getUserByFirstDigit(digit);
    }
}
