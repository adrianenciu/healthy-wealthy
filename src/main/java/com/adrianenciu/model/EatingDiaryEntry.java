package com.adrianenciu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.util.List;

public class EatingDiaryEntry {

    @Id
    private String id;

    private String breakfast;

    private String lunch;

    private String dinner;

    private List<String> snacks;

    private LocalDate date;

    @DBRef
    private User user;

    public EatingDiaryEntry() {
    }

    public EatingDiaryEntry(String breakfast, String lunch, String dinner, List<String> snacks, LocalDate date, User user) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.snacks = snacks;
        this.date = date;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public List<String> getSnacks() {
        return snacks;
    }

    public void setSnacks(List<String> snacks) {
        this.snacks = snacks;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
