package com.example.travelbooking.controller;

import com.example.travelbooking.model.TravelBooking;
import com.example.travelbooking.service.TravelBookingService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/bookings")
public class TravelBookingController {

    private final TravelBookingService service;

    public TravelBookingController(TravelBookingService service) {
        this.service = service;
    }

    // LIST
    @GetMapping
    public String list(Model model) {
        model.addAttribute("bookings", service.findAll());
        model.addAttribute("content", "list :: content");
        return "layout";
    }

    // CREATE
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("booking", new TravelBooking());
        model.addAttribute("content", "form :: content");
        return "layout";
    }

    // EDIT
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("booking", service.findById(id));
        model.addAttribute("content", "form :: content");
        return "layout";
    }

    // VIEW
    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("booking", service.findById(id));
        model.addAttribute("content", "view :: content");
        return "layout";
    }

    // SAVE
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("booking") TravelBooking booking,
                       BindingResult result,
                       RedirectAttributes redirectAttributes,
                       Model model) {

        if (result.hasErrors()) {
            model.addAttribute("content", "form :: content");
            return "layout";
        }

        service.save(booking);
        redirectAttributes.addFlashAttribute("success", "Booking saved successfully.");
        return "redirect:/bookings";
    }

    // DELETE
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        service.delete(id);
        redirectAttributes.addFlashAttribute("success", "Booking deleted successfully.");
        return "redirect:/bookings";
    }
}
