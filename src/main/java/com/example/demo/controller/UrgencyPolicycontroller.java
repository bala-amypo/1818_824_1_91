import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.demo.model.UrgencyPolicy;
import com.example.demo.service.impl.UrgencyPolicyservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
class UrgencyPolicycontroller{
@Autowired
UrgencyPolicyservice obj;
public UrgencyPolicy theCreatePolicy(@RequestBody UrgencyPolicy policy){
    return obj.createPolicy(policy);
}
@GetMapping("/{id}")
public UrgencyPolicy getPolicy(@PathVariable Long id){
    return obj.getpolicy(id);
}
@GetMapping
public List<UrgencyPolicy> getPol(){
    return obj.getPolicy();
}
}