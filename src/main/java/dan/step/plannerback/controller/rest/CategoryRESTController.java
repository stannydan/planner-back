package dan.step.plannerback.controller.rest;

import dan.step.plannerback.model.Category;
import dan.step.plannerback.model.Priority;
import dan.step.plannerback.service.category.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryRESTController {
    ICategoryService service;

    @Autowired
    public CategoryRESTController(ICategoryService service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<Category> getAll(){
        System.out.println( service.getAll());
        return service.getAll();
    }

    @GetMapping("/delete/{id}")
    public Category delete(@PathVariable("id")Integer id){
        return service.delete(id);
    }
    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        // System.out.println(priority.getId());
        return service.create(category);
    }
    @PostMapping("/update")
    public Category update(@RequestBody Category category){
        //  System.out.println(priority.getId());
        return service.update(category);
    }
    @PostMapping("/list/save")
    public void saveAll(@RequestBody List<Category> categories){
        service.saveAll(categories);
    }
}
