package com.stackroute.demo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {


    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializer");
    }


    public void destroy() throws Exception {
        System.out.println("destroy method");
    }
    public void customInit(){
        System.out.println("initialize bean");
    }
    public void customDestroy(){
        System.out.println("customdestroy bean");
    }
}
