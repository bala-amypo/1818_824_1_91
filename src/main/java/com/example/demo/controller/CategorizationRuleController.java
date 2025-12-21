import com.example.demo.service.impl.CategorizationRuleservice;
import com.example.demo.model.CategorizationRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController
class CategrizationRuleController{
    @Autowired
    CategorizationRuleservice obj;
    CategorizationRule CreateRule(Long CategoryId,CategorizationRule rule){
        return createRule(CategoryId,rule);
    }
    List<CategorizationRule> GetRule(Long categoryId){
        return getRulesByCategory(categoryId);
    }
    CategorizationRule gettingRule(Long id){
        return getRule(id);
    }
}