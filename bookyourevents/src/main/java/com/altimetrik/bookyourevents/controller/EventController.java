package com.altimetrik.bookyourevents.controller;

import com.altimetrik.bookyourevents.model.Event;
import com.altimetrik.bookyourevents.repository.EventRepository;
import com.altimetrik.bookyourevents.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/{eventId}")
    public Event getEvent(@PathVariable String eventId) {
        return eventService.getEventById(eventId);
    }

    @GetMapping("/all")
    public List<Event> getEvents(){
        //return Arrays.asList("foo", "bar");
        return eventService.getAllEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @PutMapping("/{eventId}")
    public Event updateEvent(@PathVariable String eventId, @RequestBody Event event) {
        Event existingEvent = eventService.updateEvent(eventId,event);
        // set other fields as needed
        return existingEvent;
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable String eventId) {
        eventService.deleteEvent(eventId);
    }
}
