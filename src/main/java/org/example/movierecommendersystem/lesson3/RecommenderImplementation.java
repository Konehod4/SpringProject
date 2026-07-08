package org.example.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter collaborativeFilter;

    public RecommenderImplementation(Filter collaborativeFilter) {
        this.collaborativeFilter = collaborativeFilter;
    }

    public String[] recommendMovies(String movie) {


        String[] results = collaborativeFilter.getRecommendations(movie);

        return results;
    }


}
