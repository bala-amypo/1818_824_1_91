package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Ticket;
public interface TicketService{
    public Ticket createTicket(Ticket Ticket);
    public Ticket getTicket(Long id);
    public List<Category> getAllTicket();
}