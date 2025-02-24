package com.example.userdemo.userv.dayssince.demo.days.since.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class PublicHoliday {
    @JsonProperty("date")
    private LocalDate date;

    @JsonProperty("localName")
    private String localName;

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }
}