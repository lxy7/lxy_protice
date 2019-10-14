package com.caih.cloudec.config;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * @desc 获取spring容器，以访问容器中定义的其他bean
 * 
 *       接口 dao = (接口)SpringAppContextHolder.getBean("xxxxxbean");//bean的名称
 * 
 *       不要忘记了xml <bean class="com.xxx.xxx.SpringAppContextHolder" lazy-init="false"/>
 * 
 * @author weisd
 * @version create date ：2010-11-2 上午09:38:14
 * 
 *          http://lixiaorong223.blog.163.com/blog/static/4401162920110105536999/
 * 
 */
@Component
public class SpringAppContextHolder implements ApplicationContextAware {

    // Spring应用上下文环境
    private static ApplicationContext applicationContext;

    /**
     * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     * 
     * @param applicationContext
     */
    public void setApplicationContext(ApplicationContext applicationContext) {
        // Assert.isNull(SpringAppContextHolder.applicationContext,"ApplicationContext alread holden");
        SpringAppContextHolder.applicationContext = applicationContext;
    }

    /**
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        Assert.notNull(applicationContext, "SpringAppContextHolder ApplicationContext  must be not null!");
        return applicationContext;
    }

    /**
     * 获取对象 这里重写了bean方法，起主要作用
     * 
     * @param name
     * @return Object 一个以所给名字注册的bean的实例
     * @throws BeansException
     */
    public static Object getBean(String name) throws BeansException {
        return applicationContext.getBean(name);
    }

    /**
     * 获取i18n
     * 
     * @param code
     * @return
     * @throws BeansException
     */
    public static String getMessage(String code) throws BeansException {
        return applicationContext.getMessage(code, null, Locale.CHINESE);
    }

    // public static void autowireBeanProperties(Object existingBean, int autowireMode, boolean dependencyCheck) {
    // getApplicationContext().getAutowireCapableBeanFactory().autowireBeanProperties(existingBean, autowireMode,
    // dependencyCheck);
    // }

    /**
     * @param args
     */
    // public static void main(String[] args) {
    // String a = null;
    // Assert.isNull(a,"ApplicationContext alread holden");
    // Assert.notNull(a,"ApplicationContext must be not null!");
    // System.out.println(a);
    //
    // }

}