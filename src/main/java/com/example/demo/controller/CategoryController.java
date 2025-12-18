import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springbiframework.web.nd.annotation.PostMapping;
import org.springbiframework.web.nd.annotation.Mapping;
import com.example.demo.service.CategoryService;
import com.example.demo.model.Category;
@RestController
public class CategoryController{
@Autowired
CategoryService cs;
@PostMapping("/postd")
public Category postData(@RequestBody Category cty){
    return cs.createCategory(cty);
}
@GetMapping
public List<Category> Alloutput(){
    return cs.getAllCategories();
}
}