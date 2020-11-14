package com.codewithnas.service;

import com.codewithnas.model.Speaker;
import com.codewithnas.repository.HibernateSpeakerRepositoryImpl;
import com.codewithnas.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
