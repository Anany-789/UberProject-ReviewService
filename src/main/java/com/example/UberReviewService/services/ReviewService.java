package com.example.UberReviewService.services;

import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.print("*******");
        Review r = Review.builder()
                .content("Could be better")
                .rating(3.0)
//                .createdAt(new Date())
//                .updatedAt(new Date())
                .build();
        System.out.println(r);
        reviewRepository.save(r);

//        List<Review> reviews = reviewRepository.findAll();
//        for(Review review : reviews){
//            System.out.println(review.getContent());
//        }
    }
}
