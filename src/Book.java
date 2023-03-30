public class Book extends Publication{
    private int PageNum;
    private String Publisher;
    public Book(int PubYear, String Author, String Name, int ID, int pageNum, String publisher, boolean isDusty, boolean isWormy) {
        super(PubYear, Author, Name, ID, isDusty, isWormy);
        PageNum = pageNum;
        Publisher = publisher;
    }
}
