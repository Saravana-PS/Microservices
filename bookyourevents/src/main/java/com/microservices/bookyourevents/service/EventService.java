package com.altimetrik.bookyourevents.service;

import com.altimetrik.bookyourevents.model.Event;
import com.altimetrik.bookyourevents.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(String eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(String eventId, Event event) {
        Event existingEvent = eventRepository.findById(eventId).orElse(null);
        if (existingEvent == null) {
            return null;
        }
        existingEvent.setName(event.getName());
        existingEvent.setLocation(event.getLocation());
        existingEvent.setDate(event.getDate());
        return eventRepository.save(existingEvent);
    }

    public boolean deleteEvent(String eventId) {
        Event existingEvent = eventRepository.findById(eventId).orElse(null);
        if (existingEvent == null) {
            return false;
        }
        eventRepository.delete(existingEvent);
        return true;
    }

}