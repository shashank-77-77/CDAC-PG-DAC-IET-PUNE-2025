package com.example.travelbooking.repository;

import com.example.travelbooking.model.TravelBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelBookingRepository extends JpaRepository<TravelBooking, Long> {
}
