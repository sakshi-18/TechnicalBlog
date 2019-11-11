package techblog.services;

import org.springframework.stereotype.Service;
import techblog.models.Post;

import java.util.ArrayList;
import java.util.Date;
@Service
public class PostService {
    public ArrayList<Post> getAllPosts() {
        // Creating posts
        Post p1 = new Post("Post 1", "Body of Post 1", new Date());
        Post p2 = new Post("Post 2", "Body of Post 2", new Date());
        Post p3 = new Post("Post 3", "Body of Post 3", new Date());
        Post p4 = new Post("Post 4", "Body of Post 4", new Date());
        Post p5 = new Post("Post 5", "Body of Post 5", new Date());
        Post p6 = new Post("Post 6", "Body of Post 6", new Date());
        // Creating list of post
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        posts.add(p4);
        posts.add(p5);
        posts.add(p6);
        return posts;
    }

    public ArrayList<Post> getUserPost() {
        Post p1 = new Post("Post 1", "Body of Post 1 by sakshi", new Date());
        Post p2 = new Post("Post 2", "Body of Post 2 by sakshi", new Date());
        Post p3 = new Post("Post 3", "Body of Post 3 by sakshi", new Date());

        // Creating list of post
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        return posts;
    }
}
