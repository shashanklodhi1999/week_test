package com.sha.UniversityEvent.Service;

import com.sha.UniversityEvent.Modle.Event;
import com.sha.UniversityEvent.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepo eventRepo;


    public  String  addAEvent(Event event) {
        eventRepo.save(event);
        return "event added";
    }

    public String addNoOfEvent(List<Event> events) {
        eventRepo.saveAll(events);
        return "All event added";
    }

    public List<Event> getAllEvents() {
        return (List<Event>) eventRepo.findAll();
    }

    public Event getEventsByDate(String date) {
         return eventRepo.findAllByDate(date);
    }

    public String deleteEventId(Integer eventId) {
         eventRepo.deleteById(eventId);
         return "event deleted";
    }

    public String updateEventDate(Integer id, String date) {
         Event event=eventRepo.findById(id).orElse(null);
         if(event !=null){
             event.setDate(date);
             return "data updated ";

         }else {
             return "id not found";
         }

    }
}
