package com.enset.demo.dao;

import com.enset.demo.entites.Salle;
import com.enset.demo.entites.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
