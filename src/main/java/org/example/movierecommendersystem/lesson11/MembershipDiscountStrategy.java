package org.example.movierecommendersystem.lesson11;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MembershipDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        // Apply discount based on user's membership level
        return originalPrice * 0.85; // 15% discount
    }
}
