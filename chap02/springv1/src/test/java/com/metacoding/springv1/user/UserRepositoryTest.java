package com.metacoding.springv1.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save_test(){
        //given
        User user = new User();
        user.setUsername("user1");
        user.setPassword("1234");
        user.setEmail("user1@metacoding.com");
        //when
        userRepository.save(user);
        //eye
        System.out.println("=======================");
        System.out.println("id : " + user.getId());
        System.out.println("username : " + user.getUsername());
        System.out.println("email : " + user.getEmail());
    }

    @Test
    public void findByUsername_test(){
        //given
        String username = "ssar";
        //when
        User user = userRepository.findByUsername(username);
        //eye
        System.out.println("=======================");
        System.out.println("id : " + user.getId());
        System.out.println("username : " + user.getUsername());
        System.out.println("email : " + user.getEmail());
    }

  
}
