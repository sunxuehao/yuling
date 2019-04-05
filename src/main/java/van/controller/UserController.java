package van.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import van.pojo.User;
import van.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public ResultBean<User> login(@RequestBody User user) {
        return new ResultBean<>(userService.login(user));
    }

}
