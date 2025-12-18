import org.springframework.web.bind.annotation.Service;
import com.example.demo.model.Ticket;
import com.example.demo.repository.Ticketrepo;
import org.springframework.bean.factory.annotation.Autowired;
@Service
class TicketServiceImplementation implements TicketService{
@Autowired
Ticketrepo obj;
    public Ticket createTicket(Ticket Ticket){
        return obj.create(Ticket);
    }
    public Ticket getTicket(Long id){
        return obj.getById(id);
    }
    public List<Category> getAllCategories(){
        return obj.findAll();
    }
}