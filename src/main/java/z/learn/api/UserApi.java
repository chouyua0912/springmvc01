package z.learn.api;

import org.springframework.web.bind.annotation.*;
import z.learn.model.User;

@RestController
@RequestMapping("/user")
public class UserApi {

    @RequestMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) {

        return new User(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(User u) {
        System.out.println(u.getName());
        return u;
    }
}
