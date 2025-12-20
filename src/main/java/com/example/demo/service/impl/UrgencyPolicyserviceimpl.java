import com.example.demo.model.UrgencyPolicy;
import com.example.demo.service.impl.UrgencyPolicyRules;
import com.example.demo.service.repository.UrgencyPolicyrepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

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