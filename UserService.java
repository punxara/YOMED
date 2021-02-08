package Services;

import model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> findUsers();

    String saveUser(UserModel userdata);
}
