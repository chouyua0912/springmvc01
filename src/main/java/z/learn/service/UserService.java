package z.learn.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private String userServiceName = "testService";

    public String getUserServiceName() {
        return userServiceName;
    }

    public void setUserServiceName(String userServiceName) {
        this.userServiceName = userServiceName;
    }
}
