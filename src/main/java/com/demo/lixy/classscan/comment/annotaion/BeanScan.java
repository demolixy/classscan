package com.demo.lixy.classscan.comment.annotaion;

import java.lang.annotation.*;

/**
 * @program classscan
 * @description:
 * @author: lixiangyang
 * @create: 2019/07/10 11:53
 */
@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface BeanScan {

}
