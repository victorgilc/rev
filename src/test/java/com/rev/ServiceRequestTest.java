package com.rev;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ServiceRequestTest {
    ServiceRequest o = new ServiceRequest();

    @Test(expected = RuntimeException.class)
    public void a(){
        String serviceType = null;
        // o.findProfessional(serviceType);
    }
}