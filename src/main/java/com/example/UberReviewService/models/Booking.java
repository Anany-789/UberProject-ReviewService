package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking extends BaseModel{
    @OneToOne(cascade = CascadeType.PERSIST)
    private Review review;
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date StartTime;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;
    @ManyToOne
    private Driver driver;
    @ManyToOne
    private Driver passenger;
}
