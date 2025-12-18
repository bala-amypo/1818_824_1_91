import org.springframework.stereotype.Service;
import com.example.demo.model.Ticket;
import com.example.demo.repository.Ticketrepo;
import org.springframework.beans.factory.annotation.Autowired;
@Service
class TicketServiceImplementation implements TicketService{
@Autowired
Ticketrepo obj;
    public Ticket createTicket(Ticket Ticket){
        return obj.save(Ticket);
    }
    public Ticket getTicket(Long id){
        return obj.getById(id).orElse(null);
    }
    public List<Category> getAllCategories(){
        return obj.findAll();
    }
}