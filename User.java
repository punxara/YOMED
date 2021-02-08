package Controller;

import Services.UserService;
import model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserService userServices;

    @GetMapping("/all")
    public List<UserModel> getUser() {
        return userServices.findUsers();
    }
    @PostMapping("/add")
    public String addUser(@RequestBody UserModel userdata){
       return userServices.saveUser(userdata);
    }
}
