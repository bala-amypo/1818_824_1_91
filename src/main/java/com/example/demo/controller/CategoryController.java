import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.CategoryService;
import com.example.demo.model.Category;
@RestController
public class CategoryController{
@Autowired
CategoryService cs;
public Category postData(@RequestBody Category cty){
    return cs.createCategory(cty);
}
public Category 
}