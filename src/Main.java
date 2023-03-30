import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Book Lenin = new Book(2000,"Lenin","USSR", 1,100,"MIF", true,false);
        Lenin.WipeOffTheDust();
        Lenin.CheckForWorms();

        Library library = new Library(new ArrayList<Publication>());
        library.AddToDB(Lenin);
        //library.DeleteFromDB(Lenin);
        library.ShowDB();

        User Alex = new User("Alexey Petrov", "aaa@mail.ru", "88005553535", 1, new ArrayList<Publication>());
        Alex.TakeBook(Lenin, library);
        System.out.println("База книг после того как взяли одну:");
        library.ShowDB();
        System.out.println("Книги Алексея " + "\n" + Alex.takenBooks);

    }
}