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
    public void update() {
        scanner.nextLine();
        System.out.print("=> 수정할 단어 검색 : ");
        String targetWord = scanner.nextLine();

        List<Integer> targetList = findTargetWords(targetWord);
        System.out.println("--------------------------------");
        for(int i = 0; i < targetList.size(); i++) {
            System.out.print(i + 1 + " ");
            for(int k = 0; k < wordList.get(targetList.get(i)).getLevel(); k++) {
                System.out.print("*");
            }
            System.out.print("            ");
            System.out.print(wordList.get(targetList.get(i)).getWord() + "     ");
            System.out.println(wordList.get(targetList.get(i)).getMeaning());
        }
        System.out.println("--------------------------------\n");
        System.out.print("=> 수정할 번호 선택 : ");
        int updateNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("=> 뜻 입력 : ");
        String updateMeaning = scanner.nextLine();

        wordList.get(targetList.get(updateNumber - 1)).setMeaning(updateMeaning);
        System.out.println("단어가 수정되었습니다.");

    }

    @Override
    public void delete() {
        scanner.nextLine();
        System.out.print("=> 삭제할 단어 검색 : ");
        String targetWord = scanner.nextLine();

        List<Integer> targetList = findTargetWords(targetWord);
        System.out.println("--------------------------------");
        for(int i = 0; i < targetList.size(); i++) {
            System.out.print(i + 1 + " ");
            for(int k = 0; k < wordList.get(targetList.get(i)).getLevel(); k++) {
                System.out.print("*");
            }
            System.out.print("            ");
            System.out.print(wordList.get(targetList.get(i)).getWord() + "     ");
            System.out.println(wordList.get(targetList.get(i)).getMeaning());
        }
        System.out.println("--------------------------------\n");
        System.out.print("=> 삭제할 번호 선택 : ");
        int deleteNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("=> 정말로 삭제하실래요?(Y/n) : ");
        String isDeleted = scanner.nextLine();

        while(true) {
            if(isDeleted.equals("Y")) {
                wordList.remove(targetList.get(deleteNumber - 1));
                System.out.println("단어가 삭제되었습니다.");
                break;
            } else if(isDeleted.equals("n")) {
                System.out.println("단어가 삭제되지 않았습니다.");
                break;
            } else {
                System.out.println("다시 입력해주세요.");
                System.out.print("=> 정말로 삭제하실래요?(Y/n) : ");
                isDeleted = scanner.nextLine();
            }
        }


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
        List<Integer> targetList = new ArrayList<>();

        for(int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).getWord().contains(targetWord)) {
                targetList.add(i);
            }
        }
        return targetList;
    }

    @Override
    public int findWord() {
        scanner.nextLine();
        System.out.print("=> 찾고 싶은 단어는? : ");
        String keyword = scanner.nextLine();

        System.out.println("--------------------------------");
        for(int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).getWord().contains(keyword)) {
                System.out.print(i + 1 + " ");
                for(int k = 0; k < wordList.get(i).getLevel(); k++) {
                    System.out.print("*");
                }
                System.out.print("            ");
                System.out.print(wordList.get(i).getWord() + "     ");
                System.out.println(wordList.get(i).getMeaning());
            }
        }
        System.out.println("--------------------------------\n");


        return 0;
    }

    @Override
    public void findByLevel() {
        System.out.println("=> 찾고 싶은 단계는?(1,2,3) : ");
        int selectLevel = scanner.nextInt();

        System.out.println("--------------------------------");
        for(int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).getLevel() == selectLevel) {
                System.out.print(i + 1 + " ");
                for(int k = 0; k < wordList.get(i).getLevel(); k++) {
                    System.out.print("*");
                }
                System.out.print("            ");
                System.out.print(wordList.get(i).getWord() + "     ");
                System.out.println(wordList.get(i).getMeaning());
            }
        }
        System.out.println("--------------------------------\n");
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
