package techblog.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import techblog.models.Post;
import techblog.models.User;
import techblog.services.PostService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @Autowired
    PostService ps;
    @RequestMapping("/home")
    public String index(Model model , HttpSession session){

        User logged = (User)session.getAttribute("loggedUser");
        if(logged!=null){
            return "redirect:/posts";
        }

        ArrayList<Post> posts=ps.getAllPosts();
        //sending list of posts
        model.addAttribute("list_of_posts",posts);
        return "index";
    }
}
