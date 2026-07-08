package org.example.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
    }

    public String [] getRecommendations(String movie){
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
