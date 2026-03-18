package com.juanmi.supportportal.repository;

import com.juanmi.supportportal.entity.Ticket;
import com.juanmi.supportportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByCreator(User creator);
    List<Ticket> findByAssignedAgent(User assignedAgent);
}