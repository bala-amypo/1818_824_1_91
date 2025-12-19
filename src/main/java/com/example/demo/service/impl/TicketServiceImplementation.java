import org.springframework.stereotype.Service;
import com.example.demo.model.Ticket;
import com.example.demo.service.TicektService;
import com.example.demo.repository.Ticketrepo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
class TicketServiceImplementation implements TicketService{
@Autowired
Ticketrepo obj;
    public Ticket createTicket(Ticket Ticket){
        return obj.save(Ticket);
    }
    public Ticket getTicket(Long id){
        return obj.findById(id).orElse(null);
    }
    public List<Ticket> getTicket(){
        return obj.findAll();
    }
}