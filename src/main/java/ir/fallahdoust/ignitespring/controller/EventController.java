package ir.fallahdoust.ignitespring.controller;

import ir.fallahdoust.ignitespring.model.EventDTO;
import ir.fallahdoust.ignitespring.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService service;

    @GetMapping("/api/events")
    public List<EventDTO> getEventsByTimestamp(@RequestParam(value = "timestamp", required = true) long timestamp) {
        return service.getEventsByTimestamp(timestamp);
    }

    @GetMapping("/api/events/{id}")
    public EventDTO getEventById(@PathVariable Integer id) {
        return service.getEventById(id);
    }

}