package com.sha.UniversityEvent.Contorller;

import com.sha.UniversityEvent.Modle.Event;
import com.sha.UniversityEvent.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventContorller {
    @Autowired
    EventService eventService ;

    @PostMapping("AddEvent")
    public  String  addAEvent(@RequestBody Event event) {
        return eventService.addAEvent(event);
    }
    @PostMapping("AddNoOfEvent")
    public String addNoOfEvent(@RequestBody List<Event> events){
        return eventService.addNoOfEvent(events);
    }
    @GetMapping("GetAllEvents")
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }
    @GetMapping("FindEventByDate")
    public Event getEventsByDate(@RequestParam String date) {
        return eventService.getEventsByDate(date);
    }
    @DeleteMapping("DeleteEventBYId")
    public String deleteEventBYID(@RequestParam Integer eventId){
        return eventService.deleteEventId(eventId);
    }
    @PutMapping("UpdateEventDateById")
    public String updateEventDate(@RequestParam Integer id , @RequestParam String date){
         return eventService.updateEventDate(id,date);
    }
}
