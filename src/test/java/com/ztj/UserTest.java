package com.ztj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserTest {
    
    @Test
    public void testUserService() {
        UserService service = new UserService() ;
        List<User> list = service.createUserList();
        Assertions.assertEquals(list.get(0).getName(), "ZhangSan");
        Assertions.assertEquals(list.get(0).getAge(), 10);
        Assertions.assertEquals(list.get(1).getName(), "LiSi");
        Assertions.assertEquals(list.get(1).getAge(), 20);
    }
}
