package com.alan.test;

import com.alan.domain.User;
import com.alan.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private IUserService userService;


    @Test
    public void testFindAll(){
        List<User> list=userService.findAll();
        System.out.println(list);
    }

    @Test
    public void testFindOne(){
        User user=userService.findById(2);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user=userService.findById(2);
        System.out.println("修改前:"+user);
        user.setAge(56);
        userService.updateUser(user);
        User user2=userService.findById(2);
        System.out.println("修改后:"+user2);
    }
}
