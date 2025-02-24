package com.example.userdemo.userv.dayssince.demo.days.since.model;

import java.time.LocalDate;

public class PublicHolidayResponse {
    private LocalDate date;
    private String localName;
    private long daysFromNow;

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

    public long getDaysFromNow() {
        return daysFromNow;
    }

    public void setDaysFromNow(long daysFromNow) {
        this.daysFromNow = daysFromNow;
    }
}