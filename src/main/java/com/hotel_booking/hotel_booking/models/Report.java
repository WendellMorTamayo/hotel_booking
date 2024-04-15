package com.hotel_booking.hotel_booking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="report")
public class Report {
    @Id
    @GeneratedValue
    private int reportID;
    private User type;
    private String content;
    private String timestamp;
}
