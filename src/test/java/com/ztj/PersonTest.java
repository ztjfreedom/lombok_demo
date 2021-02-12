package com.ztj;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class PersonTest {
    
    @Test
    public void testPerson() {
        Assertions.assertThrows(Exception.class, () -> Person.builder().name(null).age(20).build());
    }
    
    @Test
    public void testPersonService() {
        PersonService service = new PersonService() ;
        List<Person> list = service.createPersonList();
        Assertions.assertEquals(list.get(0).getName(), "Tom");
        Assertions.assertEquals(list.get(0).getAge(), 10);
        Assertions.assertEquals(list.get(1).getName(), "Jack");
        Assertions.assertEquals(list.get(1).getAge(), 20);
    }
    
}
