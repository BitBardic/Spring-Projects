package com.codewithnas.conferencedemo.repositories;

import com.codewithnas.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
