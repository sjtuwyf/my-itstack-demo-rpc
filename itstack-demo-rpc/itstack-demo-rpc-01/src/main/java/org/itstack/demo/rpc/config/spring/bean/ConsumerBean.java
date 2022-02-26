package org.itstack.demo.rpc.config.spring.bean;

import org.itstack.demo.rpc.config.ConsumerConfig;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ssqswyf
 * @date 2022/2/26
 */
public class ConsumerBean<T> extends ConsumerConfig<T> implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return refer();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
