package com.pragma.eventsystem;

import com.pragma.eventsystem.application.EventService;
import com.pragma.eventsystem.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Event> saveEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}