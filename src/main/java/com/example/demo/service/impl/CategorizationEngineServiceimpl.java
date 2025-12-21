package com.example.demo.service.impl;

import com.example.demo.repository.CategorizationLogrepo;
import com.example.demo.service.impl.CategorizationEngineService;
import com.example.demo.model.Ticket;
import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.Ticketrepo;
import com.example.demo.repository.CategorizationLogrepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public class  CategorizationEngineServiceimpl implements CategorizationEngineService{
    @Autowired
    CategorizationLogrepo obj1
    @Autowired
    Ticketrepo obj2;
    @Autowired
    CategorizationLogrepo obj3; 
    public Ticket categorizeTicket(Long ticketid){
        return obj2.findById(ticketid);

    }
    public List<CategorizationLog> getLogsForTicket(Long ticketid){
        return obj1.findByTicketId(ticketid);
    }
    public CategorizationLog getLog(Long id){
        return obj1.findById(id);
    }
}