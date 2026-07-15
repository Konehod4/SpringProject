package org.example.movierecommendersystem.lesson10;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired

    private Filter collaborativeFilter;

@Value("${recommender.implementation.favouriteMovie}")
private String favouriteMovie;



    @Override
    public String toString() {
        return "RecommenderImplementation{" +
                "collaborativeFilter=" + collaborativeFilter +
                '}';
    }

    public Filter getCollaborativeFilter() {
        return collaborativeFilter;
    }

    public void setCollaborativeFilter(Filter collaborativeFilter) {
        logger.info("Injection");
        this.collaborativeFilter = collaborativeFilter;
    }


    @PreDestroy
    public void preDestroy(){
        logger.info("In Recommender destroy");
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In postConstruct of RecommenderImplementation");
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    public String[] recommendMovies(String movie) {


        String[] results = collaborativeFilter.getRecommendations(movie);

        return results;
    }


}
