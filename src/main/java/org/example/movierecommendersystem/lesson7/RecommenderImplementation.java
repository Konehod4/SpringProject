package org.example.movierecommendersystem.lesson7;

import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    public RecommenderImplementation( Filter collaborativeFilter) {
        this.filter = collaborativeFilter;
    }

    public String[] recommendMovies(String movie) {


        String[] results = filter.getRecommendations(movie);

        return results;
    }


}
