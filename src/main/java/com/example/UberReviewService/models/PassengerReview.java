package com.example.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class PassengerReview extends Review {
    @Column(nullable = false)
    private String passangerRating;
    @Column(nullable = false)
    private String passengerReviewContent;
}
