package repositories;

import model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    //get user//
    //find user//
    //delete//
    //update/
}
