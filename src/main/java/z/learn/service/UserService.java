package z.learn.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import z.learn.model.User;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Resource
    private Messenger messenger;

    public List<User> getUsers() {
        return Collections.singletonList(new User("Empty:" + messenger.getMessage()));
    }

    public List<User> getUsers(String id) {

        return Collections.singletonList(new User(id + ":" + messenger.getMessage()));
    }

    public User addUser(User u) {
        System.out.println(u.getName());
        return u;
    }
}
