package dan.step.plannerback.dao.priority.impls;

import dan.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import dan.step.plannerback.model.Priority;
import dan.step.plannerback.repository.PriorityRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("mongo")
public class PriorityDAOMongoImpl implements IPriorityDAO {

    private List<Priority> list= new ArrayList<>(
            Arrays.asList(new Priority(  1,  "Низкий", "#3943e5"),
                    new Priority ( 2,  "Средний","#85D1B2"),
                    new Priority( 3, "Высокий", "#F1828D"),
                    new Priority( 4, "Очень срочно!!", "#F1128D"),
                    new Priority( 5, "W/O", "#ffffff")

            )

    );

   @PostConstruct
    void Init(){
        System.out.println("BASE!!!");
        repository.deleteAll();
        repository.saveAll(list);
    }

    private final PriorityRepositoryMongo repository;

    @Autowired
    public PriorityDAOMongoImpl(PriorityRepositoryMongo repository) {
        this.repository = repository;
    }

    @Override
    public Priority create(Priority priority) {
        Integer lastId=this.getAll().stream().mapToInt(Priority::getId).max().orElse(0);
        priority.setId(lastId+1);
        return this.repository.save(priority);
    }

    @Override
    public Priority get(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Priority update(Priority priority) {
        return repository.save(priority);
    }

    @Override
    public List<Priority> getAll() {
        return repository.findAll();
    }

    @Override
    public Priority delete(Integer id) {
        Priority p=this.get(id);
         repository.deleteById(id);
         return p;
    }
}
