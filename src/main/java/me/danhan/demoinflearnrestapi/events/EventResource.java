package me.danhan.demoinflearnrestapi.events;


import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.EntityModel;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

public class EventResource extends EntityModel<Event> {

    public EventResource(Event event, Link... links) {
        super(event, List.of(links));
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }}
