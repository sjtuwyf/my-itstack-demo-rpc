package org.itstack.demo.test.service.impl;

import org.itstack.demo.test.service.HelloService;

/**
 * @author ssqswyf
 * @date 2022/2/26
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void echo() {
        System.out.println("hi itstack demo rpc");
    }
}
