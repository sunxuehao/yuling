package van.service;

import org.springframework.stereotype.Service;
import van.pojo.User;

@Service
public interface UserService {

    User getUserByUserId(String userid);

    User register(User user);

    User login(User user);

    String encryptUserPassword(String password);

    Boolean loginout();


}
