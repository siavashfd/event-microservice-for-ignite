package ir.fallahdoust.ignitespring.model;

public class EventDTO {
    private int id;

    private String event;

    private long timestamp;

    public EventDTO() {
    }

    public EventDTO(int key, Event value) {
        this.id = key;
        this.event = value.getEvent();
        this.timestamp = value.getTimestamp();
    }

    public int getId() {
        return id;
    }

    public String getEvent() {
        return event;
    }

    public long getTimestamp() {
        return timestamp;
    }

}
