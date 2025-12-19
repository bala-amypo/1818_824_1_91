package com.example.demo.controller;
import com.example.demo.model.Ticket;
import com.example.demo.service.impl.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.sprungFramework.web.bind.annotation.RequestBody;
@RestController
public class TicketController extends TicketService{
    @Autowired
    TicketService obj;
    @PostMapping("/ticket")
    public Ticket create(@RequestBody Ticket ti){
        return obj.createTicket(ti);
    } 
}