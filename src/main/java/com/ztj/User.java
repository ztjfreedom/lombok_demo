package com.ztj;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
    
    // @Value already marks non-static, package-local fields private.
    // @Value already marks non-static fields final. 
    String name;
    
    int age;
}
