package dan.step.plannerback.service.priority.impls;

import dan.step.plannerback.dao.priority.impls.PriorityDAOMongoImpl;
import dan.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import dan.step.plannerback.model.Priority;
import dan.step.plannerback.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityServiceImpls implements IPriorityService {

    private final IPriorityDAO dao;


    @Autowired
    public PriorityServiceImpls(@Qualifier("mongo") IPriorityDAO dao) {
        this.dao = dao;
    }

    @Override
    public Priority create(Priority priority) {
        return dao.create(priority);
    }

    @Override
    public Priority get(Integer id) {
        return dao.get(id);
    }

    @Override
    public Priority update(Priority priority) {
        return dao.update(priority);
    }

    @Override
    public List<Priority> getAll() {
        return dao.getAll();
    }

    @Override
    public Priority delete(Integer id) {
        return dao.delete(id);
    }
}
