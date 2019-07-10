package com.demo.lixy.classscan.comment;

import com.demo.lixy.classscan.comment.annotaion.BeanScan;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @program classscan
 * @description:
 * @author: lixiangyang
 * @create: 2019/07/10 15:38
 */
public class BeanScanConfigurer implements BeanDefinitionRegistryPostProcessor, InitializingBean, ApplicationContextAware, BeanNameAware {

    private String beanName;
    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String s) {
        this.beanName = beanName;

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        MyClassPathDefinitonScanner scanner = new MyClassPathDefinitonScanner(beanDefinitionRegistry, BeanScan.class);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
