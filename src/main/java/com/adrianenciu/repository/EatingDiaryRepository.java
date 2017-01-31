package com.adrianenciu.repository;

import com.adrianenciu.model.EatingDiaryEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EatingDiaryRepository extends MongoRepository<EatingDiaryEntry, String> {
}
