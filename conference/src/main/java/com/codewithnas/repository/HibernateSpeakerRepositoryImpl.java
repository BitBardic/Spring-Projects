package com.codewithnas.repository;

import com.codewithnas.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Nasir");
        speaker.setLastName("Iqbal");

        speakers.add(speaker);

        return speakers;
    }
}
