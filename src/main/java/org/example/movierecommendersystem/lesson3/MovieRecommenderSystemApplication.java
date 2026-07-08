package org.example.movierecommendersystem.lesson3;

import org.example.movierecommendersystem.lesson3.RecommenderImplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
        String [] results = recommenderImplementation.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(results));




    }

}
