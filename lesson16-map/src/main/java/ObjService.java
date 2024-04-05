import java.util.List;

public interface ObjService <T extends Base,R> {
    T save(T tool);
    T find(R id);
    List<T> findAll();
    void delete(T tool);

    default void doSmth(T base) {
        base.test();
    }
}