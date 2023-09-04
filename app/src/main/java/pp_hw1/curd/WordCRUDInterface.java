package pp_hw1.curd;

import java.util.List;

public interface WordCRUDInterface {
    void toAdd();
    void update();
    void delete();
    void getAll();
    List<Integer> findTargetWords(String targetWord);


}
