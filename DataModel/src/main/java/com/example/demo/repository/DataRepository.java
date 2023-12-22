package com.example.demo.repository;

//DataRepository.java


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.DataModel;

public interface DataRepository extends MongoRepository<DataModel, String> {
 
}

