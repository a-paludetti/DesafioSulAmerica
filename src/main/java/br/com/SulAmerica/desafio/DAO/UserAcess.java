package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("User")
@Data
public class UserAcess implements UserDao {

    List<User> userList;

    @Override
    public List<User> listUsers() {
        return getUserList();
    }

    @Override
    public Optional<User> selectUserByCPF(String cpf) {
        return getUserList().stream().filter(user -> user.getCPF().equals(cpf)).findFirst();
    }

    @Override
    public List<User> selectUserByName(String name) {
        List<User> userList = new ArrayList<>();
        userList.stream().forEach(user -> {
            if (user.getName().equals(name)) {
                userList.add(user);
            }
        });
        return userList;
    }

    @Override
    public void newUser(User user) {
        getUserList().add(user);
    }

    @Override
    public void updateUser(User user) {
        selectUserByCPF(user.getCPF()).map(user1 -> {
            int index = getUserList().indexOf(user1);
            getUserList().set(index, user);
            return null;
        });
    }

    @Override
    public void removeUser(UUID id) {
        getUserList().stream().filter(user -> {
            if (user.getId().equals(id)) {
                user.setStatus(false);
            }
            return false;
        });
    }
}
