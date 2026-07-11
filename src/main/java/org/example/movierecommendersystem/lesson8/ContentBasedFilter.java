package org.example.movierecommendersystem.lesson8;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component

public class ContentBasedFilter implements Filter {

    private static int instances =0;


    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("Called filter");
    }


@Lookup
    public Movie getMovie() {
        return this.movie;
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
