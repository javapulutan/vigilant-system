package com.example.jserilo;

import java.util.Arrays;

import com.example.jserilo.post.Post;
import com.example.jserilo.post.PostRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
public class DemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	

	@Bean
	public CommandLineRunner loadData(PostRepository postRepository){

		return (i) -> {
			
			postRepository.saveAll(Arrays.asList(Post.createPost("Test 1236"),Post.createPost("Test 12347")));

		};
	}

	@Bean
	public LayoutDialect layoutDialect(){
		return new LayoutDialect();
	}


}
