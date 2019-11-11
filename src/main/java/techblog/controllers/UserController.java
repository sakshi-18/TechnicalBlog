package techblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import techblog.models.User;
import techblog.services.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/user/login")
    public String loginPage(){
        return "/user/login";
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(User user, HttpSession session){
        User check = userService.checkUser(user);
        if(check==null){
            return "/user/login";
        }
        else {
            session.setAttribute("loggedUser",check);
            return "redirect:/posts";
        }
    }

    @RequestMapping(value = "/user/logout",method = RequestMethod.POST)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/home";
    }
}
