package z.learn.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import z.learn.model.User;
import z.learn.service.UserService;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserApi {

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public List<User> getUsers() {
        throw new RuntimeException("Can not find..");
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers(@RequestParam(value = "id", required = false) String id) {

        return Collections.singletonList(new User(id));
    }


    @RequestMapping(method = RequestMethod.POST)
    public User addUser(User u) {
        System.out.println(u.getName());
        return u;
    }

    @Autowired
    private UserService userService;
}
