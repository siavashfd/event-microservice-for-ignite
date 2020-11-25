package ir.fallahdoust.ignitespring.service;

import ir.fallahdoust.ignitespring.dao.EventRepository;
import ir.fallahdoust.ignitespring.model.Event;
import ir.fallahdoust.ignitespring.model.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.cache.Cache;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventDao;

    public List<EventDTO> getEventsByTimestamp(long timestamp) {
        List<EventDTO> events = new ArrayList<>();

        for (Cache.Entry<Integer, Event> entry: eventDao.findByTimestampGreaterThanEqualOrderByTimestampDesc(timestamp))
            events.add(new EventDTO(entry.getKey(), entry.getValue()));

        return events;
    }

    public EventDTO getEventById(int eventId) {
        Cache.Entry<Integer, Event> entry = eventDao.findById(eventId);

        return new EventDTO(entry.getKey(), entry.getValue());
    }

}