package org.dummy.demo5;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo5ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("DAS_TEST");
//        String s = null;
//        s.length();
        try {
            System.out.println("DAS_TEST_wait");
            Thread.sleep(3*60*1000);
            System.out.println("DAS_TEST_done");
        } catch (InterruptedException e) {
        }

    }

}
