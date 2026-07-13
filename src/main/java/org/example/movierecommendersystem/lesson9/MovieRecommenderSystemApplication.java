package org.example.movierecommendersystem.lesson9;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@ComponentScan
@Configuration

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("appContext.xml");


        System.out.println(Arrays.toString(classPathXmlApplicationContext.getBeanDefinitionNames()));

        RecommenderImplementation recommenderImplementation = classPathXmlApplicationContext.getBean(RecommenderImplementation.class);
        System.out.println(recommenderImplementation);
        classPathXmlApplicationContext.close();

    }

}
