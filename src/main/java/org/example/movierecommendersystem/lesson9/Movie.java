package org.example.movierecommendersystem.lesson9;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


public class Movie {

    private static int instances = 0;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Called");
    }


    @PreDestroy
    public void preDestroy(){
        logger.info("In Movie destroy");
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In postContruct of Movie");
    }
    public static int getInstances(){
        return Movie.instances;
    }


}
