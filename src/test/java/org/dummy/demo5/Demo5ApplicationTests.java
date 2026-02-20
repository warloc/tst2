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

            String pCount = System.getProperty("p.count");
            System.out.println("pCount =" +  pCount);

            long j = System.currentTimeMillis() + 1 * 60 * 1000;


            while (System.currentTimeMillis() < j) {
                Thread.sleep(10 * 1000);
                System.out.println(System.currentTimeMillis()-j);
            }

            System.out.println("DAS_TEST_done");
        } catch (InterruptedException e) {
        }

    }

}
