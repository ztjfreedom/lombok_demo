package com.ztj;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PersonService {
    
    public List<Person> createPersonList() {
        log.info("Slf4j Logging");    
        List<Person> list = new ArrayList<>();
        list.add(new Person("Tom",10));
        list.add(Person.builder().name("Jack").age(20).build());
        return list;
    }
    
}
