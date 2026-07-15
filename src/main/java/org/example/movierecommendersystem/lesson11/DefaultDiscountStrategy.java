package org.example.movierecommendersystem.lesson11;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
@Scope("prototype")
public class DefaultDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        // Apply discount for online purchase
        return originalPrice * 0.95; // 5% discount
    }
}
