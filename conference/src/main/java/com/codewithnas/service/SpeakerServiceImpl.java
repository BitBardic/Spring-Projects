package com.codewithnas.service;

import com.codewithnas.model.Speaker;
import com.codewithnas.repository.HibernateSpeakerRepositoryImpl;
import com.codewithnas.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
