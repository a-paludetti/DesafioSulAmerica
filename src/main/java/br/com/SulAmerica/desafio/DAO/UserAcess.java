package br.com.SulAmerica.desafio.DAO;

import br.com.SulAmerica.desafio.Model.User;
import lombok.Data;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("User")
@Data
public class UserAcess implements UserDao {

    private final List<User> userList;

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

    @Override
    public List<User> getUserByProfile(String profile) {
        List<User> userList = new ArrayList<>();
        getUserList().forEach(user -> {
            if (user.getProfile().getProfileName().equals(profile)) {
                userList.add(user);
            }
        });
        return userList;
    }

    @Override
    public List<User> getUserByPosition(String postion) {
        List<User> userList = new ArrayList<>();
        getUserList().forEach(user -> {
            if (user.getPosition().getPositionName().equals(postion)) {
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
            if(digit.equals(position)){
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
