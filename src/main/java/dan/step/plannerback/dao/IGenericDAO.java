package dan.step.plannerback.dao;

import java.util.List;

public interface IGenericDAO<T> {
    T create(T t);
    T get(Integer id);
    T update(T t);
    List<T> getAll();
    T delete(Integer id);
}
