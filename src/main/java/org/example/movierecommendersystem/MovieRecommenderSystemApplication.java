package org.example.movierecommendersystem;

import org.example.movierecommendersystem.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        RecommenderImplementation recommenderImplementation = new RecommenderImplementation();
        String [] results = recommenderImplementation.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(results));


    }

}
