package com.example.userdemo.userv.dayssince.demo.days.since.controller;

import com.example.userdemo.userv.dayssince.demo.days.since.model.PublicHolidayResponse;
import com.example.userdemo.userv.dayssince.demo.days.since.service.PublicHolidayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public-holidays")
public class PublicHolidayController {

    private final PublicHolidayService publicHolidayService;

    public PublicHolidayController(PublicHolidayService publicHolidayService) {
        this.publicHolidayService = publicHolidayService;
    }

    @GetMapping("/first/{year}/{countryCode}")
    public PublicHolidayResponse getFirstPublicHoliday(@PathVariable int year, @PathVariable String countryCode) {
        return publicHolidayService.getFirstPublicHoliday(year, countryCode);
    }
}