package com.ztj;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    
    public List<User> createUserList() {
        List<User> list = new ArrayList<>();
        list.add(new User("ZhangSan", 10));
        list.add(User.builder().name("LiSi").age(20).build());
        return list;
    }
    
}
