package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.User;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("User")
public class UserAcess implements UserDao {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList(){ return userList;}

    @Override
    public List<User> listUsers() {
        return userList;
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
        userList.stream().forEach(user1 -> {
            if (user1.getCPF().equals(user.getCPF())) {
                return;
            } else {
                userList.add(user);
            }
        });
    }

    @Override
    public void updateUser(User user) {
        selectUserByCPF(user.getCPF())
                .map(user1 -> {
                    int index = getUserList().indexOf(user1);
                    getUserList().set(index, user);
                    return user1;
                }).orElse(null);
    }

    @Override
    public void removeUser(String cpf) {
        getUserList().stream().filter(user -> {
            if (user.getCPF().equals(cpf)) {
                user.setStatus(false);
            }
            return false;
        });
    }

    @Override
    public List<User> getUserByProfile(String profile) {
        List<User> userList = new ArrayList<>();
        getUserList().forEach(user -> {
            if (user.getProfile().equals(profile)) {
                userList.add(user);
            }
        });
        return userList;
    }

    @Override
    public List<User> getUserByPosition(String position) {
        List<User> userList = new ArrayList<>();
        getUserList().forEach(user -> {
            if (user.getPosition().equals(position)) {
                userList.add(user);
            }
        });
        return userList;
    }

    @Override
    public List<User> getUserByStatus(String status) {
        List<User> userList = new ArrayList<>();

        return userList;
    }

    @Override
    public List<User> getUserByGenderAge(String gender, String age) {
        List<User> userList = new ArrayList<>();
        getUserList().forEach(user -> {
            if (user.getGender().equals(gender) && getUserAge(user) > 18) {
                userList.add(user);
            }
        });
        return userList;
    }

    @Override
    public List<User> getUserByFirstDigit(String digit) {
        List<User> userList = new ArrayList<>();
        getUserList().forEach(user -> {
            char position = user.getCPF().charAt(0);
            if (digit.equals(position)) {
                userList.add(user);
            }
        });
        return userList;
    }

    @Override
    public int getUserAge(User user) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(user.getBirthDate());
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
