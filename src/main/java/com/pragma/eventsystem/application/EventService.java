package com.pragma.eventsystem.application;

import com.pragma.eventsystem.domain.Event;
import com.pragma.eventsystem.infrastructure.EventRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @CircuitBreaker(name = "eventService", fallbackMethod = "fallbackSaveEvent")
    public Mono<Event> saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public Flux<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Mono<Event> fallbackSaveEvent(Event event, Throwable t) {
        // Implementación de fallback
        return Mono.error(t);
    }
}