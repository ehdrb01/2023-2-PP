package pp_hw1.word;

public class Word {
    private String word;
    private int level;
    private String meaning;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public Word(String word, int level, String meaning) {
        this.word = word;
        this.level = level;
        this.meaning = meaning;
    }
}
