package com.demo.lixy.classscan.comment;

import com.demo.lixy.classscan.comment.annotaion.BeanScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * @program classscan
 * @description:
 * @author: lixiangyang
 * @create: 2019/07/10 11:53
 */
public class MyClassPathDefinitonScanner extends ClassPathBeanDefinitionScanner {

    private Class<BeanScan> type;

    public MyClassPathDefinitonScanner(BeanDefinitionRegistry registry, Class type) {
        super(registry);
        this.type = type;
    }

    /**
     * 注册 过滤器
     */
    public void registerTypeFilter(){
        addIncludeFilter(new AnnotationTypeFilter(type));
    }


}
