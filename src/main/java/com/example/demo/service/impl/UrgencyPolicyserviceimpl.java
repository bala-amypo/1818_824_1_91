import com.example.demo.model.UrgencyPolicy;
import com.example.demo.service.impl.UrgencyPolicyservice;
import com.example.demo.repository.UrgencyPolicyrepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
class UrgencyPolicyserviceimpl implements UrgencyPolicyservice{
    @Autowired
    UrgencyPolicyrepo obj;
    public Urgencypolicy createPolicy(UrgencyPolicy policy){
        return  obj.save(policy);
    }
    public List<Urgencypolicy> getAllpolicies(){
        return obj.findAll();
    }
    public Urgencypolicy getPolicy(Long id){
        return obj.findById(id).orElse(null);
    }
}