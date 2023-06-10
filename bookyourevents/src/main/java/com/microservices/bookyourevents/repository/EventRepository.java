package com.altimetrik.bookyourevents.repository;

import com.altimetrik.bookyourevents.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event,String> {
}
