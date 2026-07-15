package org.example.movierecommendersystem.lesson11;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class BundleDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        // Apply discount based on bundled purchases
        return originalPrice * 0.9; // 10% discount
    }
}