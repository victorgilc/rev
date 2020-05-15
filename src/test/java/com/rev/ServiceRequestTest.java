package com.rev;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ServiceRequestTest {
    Request o = new Request();

    @Test
    public void a(){
       com.rev.data.structure.Request entry = new com.rev.data.structure.Request();
       com.rev.data.structure.Request request =  o.create(entry);
       Assert.assertTrue(request!=null);
       Assert.assertTrue(request.getProvider()!=null);
    }
}