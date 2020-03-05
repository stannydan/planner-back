package dan.step.plannerback.service.category.impls;

import dan.step.plannerback.model.Category;
import dan.step.plannerback.repository.CategoryRepositoryMongo;
import dan.step.plannerback.service.category.interfaces.ICategoryService;

import java.util.List;

public class CategoryServiceImpls implements ICategoryService {

    CategoryRepositoryMongo repository;

    public CategoryServiceImpls(CategoryRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public Category create(Category category) {
        Integer li=this.getAll().stream().mapToInt(Category::getId).max().orElse(0);
        category.setId(li+1);
        return  repository.save(category);

    }

    @Override
    public Category get(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Category update(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public Category delete(Integer id) {
        Category c=get(id);
        repository.deleteById(id);
        return c;
    }

    @Override
    public void saveAll(List<Category> categories) {
        repository.saveAll(categories);

    }
}
