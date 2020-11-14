package com.codewithnas.service;

import com.codewithnas.model.Speaker;
import com.codewithnas.repository.HibernateSpeakerRepositoryImpl;
import com.codewithnas.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }

    /*public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }*/

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
