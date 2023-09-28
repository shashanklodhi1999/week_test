package com.sha.UniversityEvent.repo;

import com.sha.UniversityEvent.Modle.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {
    Event findAllByDate(String date);
}
