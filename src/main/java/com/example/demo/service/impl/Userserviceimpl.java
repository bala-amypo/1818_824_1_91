import com.example.demo.service.impl.Userservice;
import com.example.demo.repository.Userrepo;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements Userservice{
    @Autowired
    Userrepo obj;
    User register(User user){
        return obj.save(user);
    }
    User getUser(Long id){
        return obj.findById(id);
    }
    User findByEmail(String  Email){
        return obj.findByEmail(Email);
    }
}