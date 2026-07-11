package org.example.movierecommendersystem.lesson8;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {


    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public CollaborativeFilter() {
        super();
        logger.info("In Filter");
    }

    @Override
    public String toString() {
        return "CollaborativeFilter{}";
    }
    @PreDestroy
    public void preDestroy(){
        logger.info("In Filter destroy");
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In postContruct of Filter");
    }

    public String [] getRecommendations(String movie){
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
