package com.stackroute;
import com.stackroute.domain.Movie;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public  static  void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movie1", Movie.class);

       //diplaying the result by using the autowire-byName

        movie1.movieDisplay();


        Movie moive2=context.getBean("movie2",Movie.class);

        //displaying the result by using the autowire- byType

        moive2.movieDisplay();


    }
}
