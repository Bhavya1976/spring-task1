package com.stackroute;
import com.stackroute.domain.Movie;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public  static  void main(String args []) {

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movieFirst");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieTwo=(Movie)applicationContext.getBean("movieTwo");


        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        Movie movieThree = ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movieThree",Movie.class);

        System.out.println(movieFirst.getActor());
        System.out.println(movieTwo.getActor());
        System.out.println(movieThree.getActor());



    }
}
