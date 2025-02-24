package com.example.userdemo.userv.dayssince.demo.days.since.service;

import com.example.userdemo.userv.dayssince.demo.days.since.model.PublicHoliday;
import com.example.userdemo.userv.dayssince.demo.days.since.model.PublicHolidayResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class PublicHolidayService {

    private final RestTemplate restTemplate;

    public PublicHolidayService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PublicHolidayResponse getFirstPublicHoliday(int year, String countryCode) {
        String url = "https://date.nager.at/api/v3/PublicHolidays/" + year + "/" + countryCode;
        PublicHoliday[] holidays = restTemplate.getForObject(url, PublicHoliday[].class);

        if (holidays != null && holidays.length > 0) {
            PublicHoliday firstHoliday = holidays[0];
            long daysFromNow = ChronoUnit.DAYS.between(LocalDate.now(), firstHoliday.getDate());

            PublicHolidayResponse response = new PublicHolidayResponse();
            response.setDate(firstHoliday.getDate());
            response.setLocalName(firstHoliday.getLocalName());
            response.setDaysFromNow(daysFromNow);

            return response;
        }
        return null; // Return null if no holidays are found
    }
}