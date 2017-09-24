package io.heweiming.boot.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import io.heweiming.boot.SSMApplicationTest;
import io.heweiming.boot.model.User;
import io.heweiming.boot.service.UserService;

public class UserServiceTest extends SSMApplicationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectByPrimaryKey() {
        for (int i = 0; i < 10; i++) {
            User user = userService.selectByPrimaryKey(1);
            System.out.println(user);
        }
    }

}
