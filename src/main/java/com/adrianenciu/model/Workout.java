package com.adrianenciu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.util.List;

public class Workout {

    @Id
    private String id;

    private LocalDate day;

    private List<String> muscleGroups;

    private Long duration;

    @DBRef
    private User user;

    public Workout() {
    }

    public Workout(LocalDate day, List<String> muscleGroups, Long duration, User user) {
        this.day = day;
        this.muscleGroups = muscleGroups;
        this.duration = duration;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public List<String> getMuscleGroups() {
        return muscleGroups;
    }

    public void setMuscleGroups(List<String> muscleGroups) {
        this.muscleGroups = muscleGroups;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
