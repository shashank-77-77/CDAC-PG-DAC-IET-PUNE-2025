package com.example.travelbooking.service;

import com.example.travelbooking.model.TravelBooking;
import com.example.travelbooking.repository.TravelBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelBookingService {

    private final TravelBookingRepository repository;

    public TravelBookingService(TravelBookingRepository repository) {
        this.repository = repository;
    }

    public List<TravelBooking> findAll() {
        return repository.findAll();
    }

    public TravelBooking findById(Long id) {
        Optional<TravelBooking> opt = repository.findById(id);
        return opt.orElse(null);
    }

    public TravelBooking save(TravelBooking booking) {
        return repository.save(booking);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
