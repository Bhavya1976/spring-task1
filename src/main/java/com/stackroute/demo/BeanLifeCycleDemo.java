package com.stackroute.demo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



    public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {

        public void afterPropertiesSet(){
            System.out.println("Initializer");
        }
        public void customInit()
        {
            System.out.println("Initialize bean");
        }
        public void customDestroy(){
            System.out.println("Destroy bean");
        }

        public void destroy() {
            System.out.println("Destroy method");
        }

    }


