package com.pragma.eventsystem;

import com.pragma.eventsystem.application.EventService;
import com.pragma.eventsystem.domain.Event;
import com.pragma.eventsystem.infrastructure.EventRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class EventServiceTest {

    @Autowired
    private EventService eventService;

    @MockBean
    private EventRepository eventRepository;

    @Test
    void saveEventTest() {
        Event event = new Event("1", "type", "source", "data");
        Mockito.when(eventRepository.save(any(Event.class))).thenReturn(Mono.just(event));

        Mono<Event> savedEvent = eventService.saveEvent(event);

        StepVerifier.create(savedEvent)
               .expectNext(event)
               .verifyComplete();
    }

    @Test
    void getAllEventsTest() {
        Event event = new Event("1", "type", "source", "data");
        Mockito.when(eventRepository.findAll()).thenReturn(Flux.just(event));

        Flux<Event> events = eventService.getAllEvents();

        StepVerifier.create(events)
               .expectNext(event)
               .verifyComplete();
    }
}