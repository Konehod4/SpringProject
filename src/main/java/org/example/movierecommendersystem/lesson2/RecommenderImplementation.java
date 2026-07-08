package org.example.movierecommendersystem.lesson2;

public class RecommenderImplementation {

    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {



        String [] results = filter.getRecommendations(movie);

        return results;
    }


}
