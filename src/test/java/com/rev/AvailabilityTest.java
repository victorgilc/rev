package com.rev;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AvailabilityTest {
    Availability availability = new Availability();

	@Test
	public void aaa() {
        availability.getAvailableDays();

        Assert.assertTrue(true);
    }
}