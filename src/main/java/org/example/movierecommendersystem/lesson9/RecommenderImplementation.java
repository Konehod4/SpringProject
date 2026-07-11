package org.example.movierecommendersystem.lesson9;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

    @Override
    public String toString() {
        return "RecommenderImplementation{" +
                "filter=" + filter +
                '}';
    }

    @Autowired
    @Qualifier("9")
    public void setFilter(Filter filter) {
        logger.info("Injection");
        this.filter = filter;
    }


    @PreDestroy
    public void preDestroy(){
        logger.info("In Recommender destroy");
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In postConstruct of RecommenderImplementation");
    }

    public String[] recommendMovies(String movie) {


        String[] results = filter.getRecommendations(movie);

        return results;
    }


}
