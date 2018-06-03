package z.learn.api;

import org.springframework.web.bind.annotation.*;
import z.learn.model.User;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserApi {

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers(@RequestParam(value = "id", required = false) String id) {

        return Collections.singletonList(new User(id));
    }


    @RequestMapping(method = RequestMethod.POST)
    public User addUser(User u) {
        System.out.println(u.getName());
        return u;
    }
}
