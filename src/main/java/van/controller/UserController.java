package van.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import van.pojo.User;
import van.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultBean<User> login(@RequestBody User user) {
        return new ResultBean<>(userService.login(user));
    }

    @GetMapping("/login2")
    public String aaa() {
        System.out.println("123456");
        return "index.html";
    }

    @GetMapping("/register")
    public  Boolean register(@RequestBody User user){
        if (user.getUsername()!=null&&user.getPassword()!=null){
//            register_service(user);
            return true;
        }else {
            return false;
        }
    }
    @GetMapping("ceshi")
    public String ceshi(){
        System.out.println("ceshi");
        return "1";
    }
}
