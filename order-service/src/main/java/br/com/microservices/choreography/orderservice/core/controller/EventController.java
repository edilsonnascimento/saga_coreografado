package br.com.microservices.choreography.orderservice.core.controller;

import br.com.microservices.choreography.orderservice.core.document.Event;
import br.com.microservices.choreography.orderservice.core.dto.EventFilters;
import br.com.microservices.choreography.orderservice.core.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@AllArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping
    public Event findByFilters(EventFilters eventFilters) {
        return eventService.findByFilters(eventFilters);
    }
    @GetMapping("/")
    public List<Event> fidAll() {
        return eventService.findAll();
    }
}
