import org.srpingframework.web.bind.annotation.RestController;
import org.srpingframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.demo.service.UrgencyPolicyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.srpingframework.web.bind.annotation.PostMapping;
import org.springframework.factory.beans.annotations.Autowired;
@RestController
class UrgencyPolicycontroller{
@Autowired
UrgencyPolicyService obj;
UrgencyPolicy thecreatePolicy{
    obj.createPolicy(UrgencyPolicy policy);
}
}