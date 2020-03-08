package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.User;

import java.util.List;
import java.util.UUID;

public interface UserDao {
    List<User> listUsers();

    User selectUserByCPF(String cpf);

    List<User> selectUserByName(String name);

    User newUser();

    void updateUser(UUID id);

    void removeUser(UUID id);
}
