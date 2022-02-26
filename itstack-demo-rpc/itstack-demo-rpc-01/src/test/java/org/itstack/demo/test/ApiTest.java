package org.itstack.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ssqswyf
 * @date 2022/2/26
 */
public class ApiTest {

    public static void main(String[] args) {
        String[] configs = {"itstack-rpc-consumer.xml", "itstack-rpc-provider.xml"};
        new ClassPathXmlApplicationContext(configs);
    }

}
