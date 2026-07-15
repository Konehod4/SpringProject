package org.example.movierecommendersystem.lesson11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class EcommerceApplication {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EcommerceApplication.class);

		DiscountService discountService1 = applicationContext.getBean(DiscountService.class);
        System.out.println("Applying discounts:");
        
        // Initialing the original price
        double originalPrice = 100.0;
        System.out.println("Original Price: $" + originalPrice);

        // Apply default discount
        double defaultDiscountedPrice = discountService1.applyDefaultDiscount(originalPrice);
        System.out.println("Price after Default Discount: $" + defaultDiscountedPrice);
        
        // Apply membership discount
        double membershipDiscountedPrice = discountService1.applyMembershipDiscount(originalPrice);
        System.out.println("Price after Membership Discount: $" + membershipDiscountedPrice);

        // Apply bundle discount
        double bundleDiscountedPrice = discountService1.applyBundleDiscount(originalPrice);
        System.out.println("Price after Bundle Discount: $" + bundleDiscountedPrice);

        // Apply all discounts
        double fullyDiscountedPrice = discountService1.applyAllDiscounts(originalPrice);
        System.out.println("Price after Full Discount: $" + fullyDiscountedPrice);
        applicationContext.close();

    }

}