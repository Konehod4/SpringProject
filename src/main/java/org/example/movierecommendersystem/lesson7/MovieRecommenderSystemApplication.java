package org.example.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

      ContentBasedFilter contentBasedFilter = applicationContext.getBean(ContentBasedFilter.class);

      System.out.println(contentBasedFilter);

      Movie movie1 = contentBasedFilter.getMovie();
      Movie movie2 = contentBasedFilter.getMovie();
      Movie movie3 = contentBasedFilter.getMovie();

      System.out.println(movie1);
      System.out.println(movie2);
      System.out.println(movie3);

      System.out.println(ContentBasedFilter.getInstances());
      System.out.println(Movie.getInstances());



    }

}
