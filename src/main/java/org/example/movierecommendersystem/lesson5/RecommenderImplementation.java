package org.example.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {


        String[] results = filter.getRecommendations(movie);

        return results;
    }


}
