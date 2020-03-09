package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {
    List<User> listUsers();

    Optional<User> selectUserByCPF(String cpf);

    List<User> selectUserByName(String name);

    void newUser(User user);

    void updateUser(User user);

    void removeUser(UUID id);
}
