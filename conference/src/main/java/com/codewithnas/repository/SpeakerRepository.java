package com.codewithnas.repository;

import com.codewithnas.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
