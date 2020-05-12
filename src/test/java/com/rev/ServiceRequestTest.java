package com.rev;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ServiceRequestTest {
    Request o = new Request();

    @Test
    public void a(){
       Request entry = new Request();
    Request request =  o.create(entry);
       Assert.assertTrue(request!=null);
    }
}