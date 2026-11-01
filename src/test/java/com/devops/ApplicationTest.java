
package com.devops;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void applicationStartsSuccessfully() {
        assertNotNull(applicationContext.getBean(Application.class));
    }
}
