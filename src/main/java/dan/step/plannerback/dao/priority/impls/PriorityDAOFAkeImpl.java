package dan.step.plannerback.dao.priority.impls;

import dan.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import dan.step.plannerback.model.Priority;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("fake")
public class PriorityDAOFAkeImpl implements IPriorityDAO {

    private List<Priority> list= new ArrayList<>(
            Arrays.asList(new Priority(1,"Orange","red"),
                    new Priority(2,"Green","blue"),
                    new Priority(3,"Urgent","green")


            )

    );

    @Override
    public Priority create(Priority priority) {
        return null;
    }

    @Override
    public Priority get(Integer id) {
        return null;
    }

    @Override
    public Priority update(Priority priority) {
        return null;
    }

    @Override
    public List<Priority> getAll() {
        return this.list;
    }

    @Override
    public Priority delete(Integer id) {
        return null;
    }
}
