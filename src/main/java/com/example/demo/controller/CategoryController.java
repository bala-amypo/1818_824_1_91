import org.springframework.web.beans.factory.annotations.Autowired;
import org.springframework.web.bind.factory.annotations.RestController;
import com.example.demo.service.C
@RestController
public class CategoryController{
@Autowired
CategoryService cs;
public Category postData(@RequestBody Category cty){
    return cs.createCategory(cty);
}
}