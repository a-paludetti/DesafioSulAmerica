package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("User")
@Data
public class UserAcess implements UserDao{

    List<User> userList;

    @Override
    public List<User> listUsers() {
        return getUserList();
    }

    @Override
    public User selectUserByCPF(String cpf) {

        return null;
    }

    @Override
    public List<User> selectUserByName(String name) {
        return null;
    }

    @Override
    public User newUser() {
        return null;
    }

    @Override
    public void updateUser(UUID id) {

    }

    @Override
    public void removeUser(UUID id) {

    }
}
