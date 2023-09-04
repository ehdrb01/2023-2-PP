package pp_hw1.word;

import pp_hw1.curd.WordCRUDInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCRUD implements WordCRUDInterface {
    private Scanner scanner = new Scanner(System.in);
    private List<Word> wordList = new ArrayList<>();


    @Override
    public void toAdd() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = scanner.nextInt();
        String name = scanner.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = scanner.nextLine();

        Word word = new Word(name, level, meaning);
        wordList.add(word);
    }

    @Override
    public void update(Object object) {
        System.out.print("=> 수정할 단어 검색 : ");
        String targetWord = scanner.nextLine();
    }

    @Override
    public void delete(Object object) {
        System.out.print("=> 삭제할 단어 검색 : ");
        String targetWord = scanner.nextLine();
    }

    @Override
    public void getAll() {
        System.out.println("--------------------------------");
        for(int i = 0; i < wordList.size(); i++) {
            System.out.print(i + 1 + " ");
            for(int k = 0; k < wordList.get(i).getLevel(); k++) {
                System.out.print("*");
            }
            System.out.print("            ");
            System.out.print(wordList.get(i).getWord() + "     ");
            System.out.println(wordList.get(i).getMeaning());
        }
        System.out.println("--------------------------------\n");
    }

    @Override
    public List<Integer> findTargetWords(String targetWord) {


        return null;
    }

    public int selectMenu() {
        System.out.println("********************");
        System.out.println("1. 모든 단어 보기");
        System.out.println("2. 수준별 단어 보기");
        System.out.println("3. 단어 검색");
        System.out.println("4. 단어 추가");
        System.out.println("5. 단어 수정");
        System.out.println("6. 단어 삭제");
        System.out.println("7. 파일 저장");
        System.out.println("0. 나가기");
        System.out.println("********************");
        System.out.print("=> 원하는 메뉴는? ");

        return scanner.nextInt();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }
}
