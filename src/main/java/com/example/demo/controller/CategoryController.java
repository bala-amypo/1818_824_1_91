import org.springframework.web.bon
@RestController
public class CategoryController{

@Autowired
CategoryService cs;

public Category postData(@RequestBody Category cty){
    return cs.createCategory(cty);
}




}