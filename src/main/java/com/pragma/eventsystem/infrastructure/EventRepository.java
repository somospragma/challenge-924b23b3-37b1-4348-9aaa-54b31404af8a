package com.pragma.eventsystem.infrastructure;

import com.pragma.eventsystem.domain.Event;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EventRepository {
    private final Map<String, Event> events = new HashMap<>();

    public Mono<Event> save(Event event) {
        events.put(event.getId(), event);
        return Mono.just(event);
    }

    public Flux<Event> findAll() {
        return Flux.fromIterable(events.values());
    }
}