package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;
import com.example.demo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class TicketServiceImplementation implements TicketService{
@Autowired
TicketRepository obj;
    public Ticket createTicket(Ticket Ticket){
        return obj.save(Ticket);
    }
    public Ticket getTicket(Long id){
        return obj.findById(id).orElse(null);
    }
    public List<Ticket> getAllTicket(){
        return obj.findAll();
    }
}