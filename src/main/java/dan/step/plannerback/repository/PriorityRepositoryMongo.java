package dan.step.plannerback.repository;

import com.mongodb.client.MongoDatabase;
import dan.step.plannerback.model.Priority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepositoryMongo extends MongoRepository<Priority,Integer> {
}
