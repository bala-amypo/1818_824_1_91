import org.srpingframework.web.bind.annotation.RestController;
import org.srpingframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.demo.service.UrgencyPolicyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.srpingframework.web.bind.annotation.PostMapping;
import org.srpingframework.web.bind.annotation.RequestBody;
import org.springframework.factory.beans.annotations.Autowired;
@RestController
class UrgencyPolicycontroller{
@Autowired
UrgencyPolicyService obj;
public UrgencyPolicy theCreatePolicy(@RequestBody Urg policy){
    return obj.createPolicy(UrgencyPolicy policy);
}
@GetMapping("/{id}")
public UrgencyPolicy getPolicy(@PathVariable Long id){
    return obj.getpolicy(id);
}
public List<UrgencyPolicy> getPol(){
    return obj.getPolicy();
}
}