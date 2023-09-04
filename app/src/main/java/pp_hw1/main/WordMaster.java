package pp_hw1.main;

import pp_hw1.word.Word;
import pp_hw1.word.WordCRUD;

import java.util.List;

public class WordMaster {
    private WordCRUD wordCRUD = new WordCRUD();


    public static void main(String[] args) {
        WordMaster wordMaster = new WordMaster();

        wordMaster.run(args);
    }

    public void run(String[] args) {
        System.out.println("*** 영단어 마스터 ***\n");
        while(true) {
            int menu = wordCRUD.selectMenu();

            if(menu == 1) {
                wordCRUD.getAll();
            } else if(menu == 2) {

            } else if(menu == 3) {

            } else if(menu == 4){ // 단어 추가
                wordCRUD.toAdd();
                System.out.println("새 단어가 단어장에 추가되었습니다 !!!");
            } else if(menu == 5) {

            } else if(menu == 6) {

            } else if(menu == 7) {

            } else {
                break;
            }
        }
    }

    public WordCRUD getWordCRUD() {
        return wordCRUD;
    }

    public void setWordCRUD(WordCRUD wordCRUD) {
        this.wordCRUD = wordCRUD;
    }
}
