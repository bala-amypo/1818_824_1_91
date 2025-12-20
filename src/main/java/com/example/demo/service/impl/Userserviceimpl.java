import com.example.demo.service.impl.Userservice;
import com.example.demo.model.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements Userservice{
    @Autowired
    Userrepo obj;
    public User register(User user){
        obj.save(user)
    }
    public User getUser(Long id){
        obj.findById(id);
    }
    
}