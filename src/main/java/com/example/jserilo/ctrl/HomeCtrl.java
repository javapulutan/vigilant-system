package com.example.jserilo.ctrl;

import java.util.stream.Collectors;

import com.example.jserilo.post.PostRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCtrl {

    private static Logger log = LoggerFactory.getLogger(HomeCtrl.class.getName());

    private PostRepository postRepository;

    public HomeCtrl(PostRepository postRepository){

        this.postRepository = postRepository;

  
    }

    @GetMapping("/")
    public String home(Model model){

        log.debug("home() - entry");

        model.addAttribute("posts", postRepository.findAll().stream().map(p -> new PostRecord(p.getId(),p.getTitle())).collect(Collectors.toList()));

        return "home";
    }

    @GetMapping("/post")
    public String post(){

        log.debug("post() - entry");

        return "post";
    }

    static record PostRecord(int id, String title){}


}
