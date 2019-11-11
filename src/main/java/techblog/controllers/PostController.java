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

@Controller
public class PostController {
    @Autowired
    PostService postService;

    @RequestMapping("/posts")
    public String userPostPage(Model model, HttpSession session){
        User logged= (User)session.getAttribute("loggedUser");
        if(logged==null){
            return "/user/login";
        }
        ArrayList<Post> posts = postService.getUserPost();
        model.addAttribute("list_of_posts",posts);
        return "posts";
    }
}
