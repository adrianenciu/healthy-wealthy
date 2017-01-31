package com.adrianenciu.repository;

import com.adrianenciu.model.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkoutRepository extends MongoRepository<Workout, String> {
}
