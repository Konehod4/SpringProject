package org.example.movierecommendersystem.lesson2;

public class ContentBasedFilter implements Filter {
    public ContentBasedFilter() {
    }

    public String [] getRecommendations(String movie){
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
