package org.itstack.demo.rpc.config.spring;

import org.itstack.demo.rpc.config.spring.bean.ConsumerBean;
import org.itstack.demo.rpc.config.spring.bean.ProviderBean;
import org.itstack.demo.rpc.config.spring.bean.ServerBean;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author ssqswyf
 * @date 2022/2/26
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("consumer", new MyBeanDefinitionParser(ConsumerBean.class));
        registerBeanDefinitionParser("provider", new MyBeanDefinitionParser(ProviderBean.class));
        registerBeanDefinitionParser("server",new MyBeanDefinitionParser(ServerBean.class));
    }
}
