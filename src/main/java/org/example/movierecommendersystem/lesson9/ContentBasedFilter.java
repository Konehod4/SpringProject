package org.example.movierecommendersystem.lesson9;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("9")

public class ContentBasedFilter implements Filter {

    private static int instances = 0;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("Called filter");
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("In Filter destroy");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("In postContruct of Filter");
    }

    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
