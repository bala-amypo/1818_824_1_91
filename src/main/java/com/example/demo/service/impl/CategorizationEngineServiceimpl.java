package com.example.demo.service.impl;

import Categorizationlog
import com.example.demo.service.impl.CategorizationEngineService;
import com.example.demo.model.Ticket;
import com.example.demo.model.CategorizationLog;
import com.example.demo.repository.Ticketrepo;
import com.example.demo.repository.CategorizationLogrepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
public class  CategorizationEngineServiceimpl implements CategorizationEngineService{
    @Autowired
    CategorizationLogrepo obj1
    @Autowired
    Ticketrepo obj2;
    @Autowired
    CategorizationLogrepo obj3; 
    public Ticket categorizeTicket(Long ticketid){
        Ticekt ti=
    }
    public List<CategorizationLog> getLogsForTicket(Long ticketid){

    }
    public CategorizationLog getLog(Long id){

    }
}