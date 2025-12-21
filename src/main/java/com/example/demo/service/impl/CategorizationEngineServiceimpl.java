package com.example.demo.service.impl;

import com.example.demo.service.impl.CategorizationEngineService;
import com.example.demo.model.Ticket;
import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.Ticketrepo;
import com.example.demo.repository.CategorizationLogrepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
public class  CategorizationEngineServiceimpl implements CategorizationEngineService{
    @Autowired
    Ticketrepo obj
    @Autowired
    CategorizationLogrepo ob; 
    public Ticket categorizeTicket(Long ticketid){
        
    }
    public List<CategorizationLog> getLogsForTicket(Long ticketid){

    }
    public CategorizationLog getLog(Long id){

    }
}