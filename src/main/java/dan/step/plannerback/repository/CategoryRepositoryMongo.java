package dan.step.plannerback.repository;

import dan.step.plannerback.model.Category;
import dan.step.plannerback.model.Priority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoryMongo extends MongoRepository<Category,Integer> {
}
