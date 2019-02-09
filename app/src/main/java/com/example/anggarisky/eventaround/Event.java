package com.example.anggarisky.eventaround;

public class Event {

    String eventitle;
    String eventcategory;
    Integer eventpicture;

    public Event() {
    }

    public Event(String eventitle, String eventcategory, Integer eventpicture) {
        this.eventitle = eventitle;
        this.eventcategory = eventcategory;
        this.eventpicture = eventpicture;
    }

    public String getEventitle() {
        return eventitle;
    }

    public void setEventitle(String eventitle) {
        this.eventitle = eventitle;
    }

    public String getEventcategory() {
        return eventcategory;
    }

    public void setEventcategory(String eventcategory) {
        this.eventcategory = eventcategory;
    }

    public Integer getEventpicture() {
        return eventpicture;
    }

    public void setEventpicture(Integer eventpicture) {
        this.eventpicture = eventpicture;
    }
}
