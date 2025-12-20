import com.example.demo.model.UrgencyPolicy;
import com.example.demo.service.impl.UrgencyPolicyRules;
import com.example.demo.service.repository.UrgecyPolicyrepo;
import org.springframework.sterotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
class UrgencyPolicyserviceimpl implements UrgencyPolicyservice{
    @Autowired
    UrgencyPolicyrepo obj;
    public Urgencypolicy createPolicy(UrgencyPolicy policy){
        obj.save(policy);
    }
    public List<Urgencypolicy> getAllpolicies(){
        obj.findAll();
    }
    public Urgencypolicy getPolicy(Long id){
        obj.findById(id).orElse(null);
    }
}