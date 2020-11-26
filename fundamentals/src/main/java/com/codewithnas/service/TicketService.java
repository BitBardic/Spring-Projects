package com.codewithnas.service;

import com.codewithnas.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
}
