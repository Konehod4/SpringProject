package org.example.movierecommendersystem;

import org.example.movierecommendersystem.lesson1.RecommenderImplementation;
import org.example.movierecommendersystem.lesson2.CollaborativeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        RecommenderImplementation recommenderImplementation1 = new RecommenderImplementation();
        String [] results1 = recommenderImplementation1.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(results1));

        org.example.movierecommendersystem.lesson2.RecommenderImplementation recommenderImplementation2 = new org.example.movierecommendersystem.lesson2.RecommenderImplementation(new CollaborativeFilter());
        String [] results2 = recommenderImplementation2.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(results2));


    }

}
