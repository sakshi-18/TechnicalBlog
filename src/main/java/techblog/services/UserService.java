package techblog.services;

import org.springframework.stereotype.Service;
import techblog.models.User;

@Service
public class UserService {
    public User checkUser(User user) {
        if(user.getUsername().equals("sakshi_18") && user.getPassword().equals("sakshi987/")){
            return user;
        }
        else{
            return null;
        }
    }
}
