package org.itstack.demo.rpc.config.spring.bean;

import org.itstack.demo.rpc.config.ProviderConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author ssqswyf
 * @date 2022/2/26
 */
public class ProviderBean extends ProviderConfig implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // 发布生产者
        doExport();
    }
}
