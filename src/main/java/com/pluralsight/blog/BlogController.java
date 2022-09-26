package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {
    private PostRepository postRepository;
    public BlogController(PostRepository postRepository){
    }


    @RequestMapping("/")
    public String listPosts(ModelMap modelMap){
        List<Post> posts = PostRepository.getAllPosts();
        modelMap.put("posts", posts);
        modelMap.put("title", "Blog Post 1");
        return "home";
    }

}


