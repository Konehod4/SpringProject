package org.example.movierecommendersystem;

import org.example.movierecommendersystem.lesson10.RecommenderImplementation;
import org.example.movierecommendersystem.lesson2.CollaborativeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@SpringBootApplication

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        RecommenderImplementation recommenderImplementation = new RecommenderImplementation();
        String [] results = recommenderImplementation.recommendMovies(recommenderImplementation.getFavouriteMovie());
System.out.println(recommenderImplementation.getFavouriteMovie());
        System.out.println(Arrays.toString(results));




    }

}
