package com.imooc.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.repository.UserRepository;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


/**
 * Created by 瓦力.
 */
@SpringBootTest
public class UserRepositoryTest   {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne() {
        Optional<User> byId = userRepository.findById(1L);
//        Assert.assertEquals("wali", user.getName());
    }
}
