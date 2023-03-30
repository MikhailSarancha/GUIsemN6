public class Journal extends Publication{
    private int JournalNum;
    private String Theme;

    public Journal(int pubYear, String author, String name, int ID, boolean isDusty, boolean isWormy, int journalNum, String theme) {
        super(pubYear, author, name, ID, isDusty, isWormy);
        JournalNum = journalNum;
        Theme = theme;
    }
}
