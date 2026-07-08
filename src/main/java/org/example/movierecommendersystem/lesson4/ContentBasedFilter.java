package org.example.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("CBF")
public class ContentBasedFilter implements Filter {
    public ContentBasedFilter() {
    }

    public String [] getRecommendations(String movie){
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
