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
        wordCRUD.getFileData();

        System.out.println("*** 영단어 마스터 ***\n");
        while(true) {
            int menu = wordCRUD.selectMenu();

            if(menu == 1) { // 모든 단어보기
                wordCRUD.getAll();
            } else if(menu == 2) { // 수준별 단어보기
                wordCRUD.findByLevel();
            } else if(menu == 3) { // 단어 검색
                wordCRUD.findWord();
            } else if(menu == 4){ // 단어 추가
                wordCRUD.toAdd();
                System.out.println("새 단어가 단어장에 추가되었습니다 !!!");
            } else if(menu == 5) { // 단어 수정
                wordCRUD.update();
            } else if(menu == 6) { // 단어 삭제
                wordCRUD.delete();
            } else if(menu == 7) { // 파일 저장
                wordCRUD.saveToFile();
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
