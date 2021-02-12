package com.ztj;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Person {
    
    @NonNull
    private String name;
    
    private int age;
}
