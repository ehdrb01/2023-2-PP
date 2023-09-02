package pp_hw1.curd;

public interface WordCRUDInterface {
    Object toAdd();
    int update(Object object);
    int delete(Object object);
    void selectOne(int id);


}
