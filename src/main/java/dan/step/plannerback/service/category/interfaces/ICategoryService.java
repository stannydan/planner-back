package dan.step.plannerback.service.category.interfaces;

import dan.step.plannerback.model.Category;
import dan.step.plannerback.service.IGenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService extends IGenericService<Category> {
    void saveAll(List<Category> categories);
}
