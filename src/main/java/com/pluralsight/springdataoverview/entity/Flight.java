package com.pluralsight.springdataoverview.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity(name = "Fligths")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fligth_id")
    private Long id;
    @Column(name = "origin")
    private String origin;
    @Column(name = "destination")
    private String destination;
    @Column(name = "cheduledAt")
    private LocalDateTime scheduledAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(LocalDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    @Override
    public String toString() {
        return "Flight{" +
            "id=" + id +
            ", origin='" + origin + '\'' +
            ", destination='" + destination + '\'' +
            ", scheduledAt=" + scheduledAt +
            '}';
    }
}
