package pp_hw1.curd;

import java.util.List;

public interface WordCRUDInterface {
    void toAdd();
    void update(Object object);
    void delete(Object object);
    void getAll();
    List<Integer> findTargetWords(String targetWord);


}
