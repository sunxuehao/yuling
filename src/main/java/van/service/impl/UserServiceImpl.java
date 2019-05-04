package van.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import van.pojo.User;
import van.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByUserId(String userid){
        List<User> userList = new ArrayList<>();
        return null;
    }

    @Override
    public User register(User user) {

        return null;
    }

    @Override
    public User login(User user) {
        return user;
    }

    @Override
    public String encryptUserPassword(String password) {
        return null;
    }

    @Override
    public Boolean                                       loginout() {
        return null;
    }
}
