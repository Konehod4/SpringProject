package org.example.movierecommendersystem.lesson9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);

    Movie movie = applicationContext.getBean(Movie.class);
System.out.println(movie);


      RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
System.out.println(recommenderImplementation);


    }

}
