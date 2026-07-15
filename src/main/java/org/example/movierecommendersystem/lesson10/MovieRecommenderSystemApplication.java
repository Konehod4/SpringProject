package org.example.movierecommendersystem.lesson10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext (MovieRecommenderSystemApplication.class);



        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        RecommenderImplementation recommenderImplementation = applicationContext.getBean("recommenderImplementation", RecommenderImplementation.class);
        System.out.println(recommenderImplementation.getCollaborativeFilter());
        System.out.println(recommenderImplementation.getFavouriteMovie());
        applicationContext.close();

    }

}
