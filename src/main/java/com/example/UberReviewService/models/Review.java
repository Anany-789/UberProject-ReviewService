package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name="booking_review")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {
    @Column(nullable = false)
    private String content;

    Double rating;

    @Override
    public String toString(){
        return "Review : "+ this.content +" "+ this.rating +" "+ this.createdAt;
    }
}
