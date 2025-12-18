import org.springframework.web.beans.
@RestController
public class CategoryController{

@Autowired
CategoryService cs;

public Category postData(@RequestBody Category cty){
    return cs.createCategory(cty);
}




}