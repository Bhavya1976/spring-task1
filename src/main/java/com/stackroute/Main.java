package com.stackroute;
import com.stackroute.domain.Movie;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public  static  void main(String args []) {



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieFirst=applicationContext.getBean("movieFirst",Movie.class);
        movieFirst.display();

        Movie movieTwo=applicationContext.getBean("movieTwo",Movie.class);
        movieTwo.display();



        Movie movieThree=applicationContext.getBean("movieThree",Movie.class);
        movieThree.display();

        Movie movieFour=applicationContext.getBean("movieFour",Movie.class);
        movieFour.display();


        System.out.println(movieFirst==movieTwo);
        System.out.println(movieThree==movieFour);


    }
}
