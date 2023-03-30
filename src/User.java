import java.util.ArrayList;

public class User {
    String Name;
    String Email;
    String PhoneNumber;
    int ID;
    ArrayList<Publication> takenBooks;

    public User(String name, String email, String phoneNumber, int ID, ArrayList<Publication> takenBooks) {
        Name = name;
        Email = email;
        PhoneNumber = phoneNumber;
        this.ID = ID;
        this.takenBooks = takenBooks;
    }

    public void TakeBook(Publication publication, Library library){
        if (library.getPubications().contains(publication)) {
            this.takenBooks.add(publication);
            library.GiveBook(publication);
        }
        else{
            throw new RuntimeException("Ошибка - в библиотеке нет такой книги");
        }
    }

    public void ReturnBook(Publication publication, Library library){
        library.AddToDB(publication);
    }
}
