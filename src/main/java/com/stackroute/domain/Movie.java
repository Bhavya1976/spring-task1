package com.stackroute.domain;



import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private Actor actor;
    private ApplicationContext applicationContext;
    public Movie(){
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void movieDisplay(){

        actor.display();
    }


    public void setBeanFactory(BeanFactory beanFactory)
    {
        System.out.println(beanFactory);
    }

    public void setBeanName(String s) {

       System.out.println(s);

    }

    public void setApplicationContext(ApplicationContext applicationContext){

        System.out.println(applicationContext);

    }
}