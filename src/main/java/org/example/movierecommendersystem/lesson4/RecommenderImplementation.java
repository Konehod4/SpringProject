package org.example.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    @Qualifier("CF")
    private Filter filter;



    public String[] recommendMovies(String movie) {


        String[] results = filter.getRecommendations(movie);

        return results;
    }


}
