package com.codewithnas.repository;

import com.codewithnas.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
