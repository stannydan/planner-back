package dan.step.plannerback.service;

import java.util.List;

public interface IGenericService<T> {
    T create(T t);
    T get(Integer id);
    T update(T t);
    List<T> getAll();
    T delete(Integer id);
}
