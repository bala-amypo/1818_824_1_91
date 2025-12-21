package com.example.demo.repository;
import com.example.demo.model.CategorizationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import 
public interface CategorizationLogrepo extends JpaRepository<CategorizationLog,Long>{
    List<Ticket> getByTicketId(ticketid)
}