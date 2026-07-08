package org.example.movierecommendersystem.lesson3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class ContentBasedFilter implements Filter {
    public ContentBasedFilter() {
    }

    public String [] getRecommendations(String movie){
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
