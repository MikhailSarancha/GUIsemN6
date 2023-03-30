abstract public class Publication implements LibObject{
    private int PubYear;
    private String Author;
    private String Name;
    private int ID;
    private boolean isDusty;
    private boolean isWormy;

    public void WipeOffTheDust(){
        System.out.println( (isDusty) ? "Больше не пыльная!" : "Ну, лищний раз протереть тоже можно");
        isDusty = false;
    }


    public void CheckForWorms() {
        System.out.println( (isWormy) ? "Тут поселился книжный червь" : "Тут червя нет");
    }

    public Publication(int pubYear, String author, String name, int ID, boolean isDusty, boolean isWormy) {
        PubYear = pubYear;
        Author = author;
        Name = name;
        this.ID = ID;
        this.isDusty = isDusty;
        this.isWormy = isWormy;
    }
    @Override
    public String toString(){
        return "["+ ID + "] " + Name + "-" + Author;
    }
}