package implement;

import Services.UserService;
import model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> findUsers() {

        //dataBase//
       List<UserModel>allusers = userRepository.findAll();
       return allusers;

    }

    @Override
    public String saveUser(UserModel userdata) {
        userRepository.save(userdata);
        return "Data saved";
    }
}
