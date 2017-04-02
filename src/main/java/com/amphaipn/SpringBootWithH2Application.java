package com.amphaipn;

import com.amphaipn.domain.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootWithH2Application {
    /*private Logger logger = LoggerFactory.getLogger(SpringBootWithH2Application.class);*/

    //PostRepository
    /*@Autowired
    private PostRepository postRepository;*/

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithH2Application.class, args);
    }

//    //PostContruct
//    @PostConstruct
//    void seePost() {
//        logger.info("SeePost method Called.....................................................");
//        for (Post post : postRepository.findAll()) {
//            logger.info(post.toString());
//        }
//    }

}
