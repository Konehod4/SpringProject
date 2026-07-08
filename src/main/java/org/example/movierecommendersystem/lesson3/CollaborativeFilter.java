package org.example.movierecommendersystem.lesson3;

import org.example.movierecommendersystem.lesson3.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
    }

    public String [] getRecommendations(String movie){
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
